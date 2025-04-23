import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        int index = 0;
        
        // queue 초기화
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < prices.length; i++) {
            q.add(new Pair(i, prices[i]));
        }
        
        while(!q.isEmpty()) {
            
            Pair now = q.poll();
            
            if(q.isEmpty()) { // 마지막 값은 그냥 넣어준다.
                answer[index] = 0;
            }
            
            // 나머지 q를 돌면서 now의 price값보다 작은 price가 있는지?
            for(Pair pair : q) {
                if(pair.price < now.price) { // 주식 가격이 떨어짐.
                    answer[index] = pair.index - now.index;
                    break;
                }
                
                if(pair.index == prices.length - 1) { // 마지막 까지 갔는데 주식 가격이 떨어진 경우가 없을 경우
                    answer[index] = pair.index - now.index;
                    break;
                }
            }
            index++;
        }
        return answer;
    }
}

class Pair {
    int index;
    int price;
    
    Pair(int i, int p) {
        this.index = i;
        this.price = p;
    }
}
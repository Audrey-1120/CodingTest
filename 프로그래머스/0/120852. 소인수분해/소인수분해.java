import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                temp.add(i);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}
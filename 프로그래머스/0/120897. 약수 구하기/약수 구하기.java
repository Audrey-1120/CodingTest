import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int index = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                if(i * i == n) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
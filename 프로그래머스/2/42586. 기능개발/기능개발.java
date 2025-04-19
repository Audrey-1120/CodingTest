import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answer = new ArrayList<>();
        int n = progresses.length;
        int[] done = new int[n];
        
        for(int i = 0; i < n; i++) {
            done[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int count = 1;
        int maxDay = done[0];
        
        for(int i = 1; i < done.length; i++) {
            if(done[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = done[i];
            }
        }
        answer.add(count);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
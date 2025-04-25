import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int[] com : commands) {
            
            int[] temp = Arrays.copyOfRange(array, com[0] - 1, com[1]);
            Arrays.sort(temp);
            answer[index] = temp[com[2] - 1];
            index++;
        }
        
        return answer;
    }
}
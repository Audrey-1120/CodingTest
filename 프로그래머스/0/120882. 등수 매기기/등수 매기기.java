import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        int n = score.length;
        int[] answer = new int[n];
        double[] avg = new double[n];
        
        for(int i = 0; i < n; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        Double[] sorted = Arrays.stream(avg)
                                .boxed()
                                .toArray(Double[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(avg[i] == sorted[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
         
        return answer;
    }
}
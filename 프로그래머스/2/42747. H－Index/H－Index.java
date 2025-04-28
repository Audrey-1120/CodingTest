import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            
            // 남은 논문의 수
            int k = citations.length - i;
            
            if(citations[i] >= k) {
                answer = k;
                break;
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] sorted = Arrays.copyOf(emergency, emergency.length); // 원본 배열 복사
        Arrays.sort(sorted); // 오름차순 정렬한다.
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for(int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], sorted.length - i); // 높은 숫자가 순위가 더 높으므로..
        }
        
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }
            
            
        return answer;
    }
}
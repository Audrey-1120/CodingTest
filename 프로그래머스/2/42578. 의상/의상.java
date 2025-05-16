import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] clo : clothes) {
            map.put(clo[1], map.getOrDefault(clo[1], 0) + 1);
        }
        
        for(String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }
        
        return answer - 1;
    }
}
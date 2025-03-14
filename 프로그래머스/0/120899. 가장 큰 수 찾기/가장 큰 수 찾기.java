import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        for(int num : array) {
            map.put(num, i);
            i++;
        }
        
        answer[0] = map.lastKey();
        answer[1] = map.get(map.lastKey());
        
        return answer;
    }
}
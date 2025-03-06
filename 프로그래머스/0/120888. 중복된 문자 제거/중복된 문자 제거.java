import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            
            if(!seen.contains(c)) {
                seen.add(c);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
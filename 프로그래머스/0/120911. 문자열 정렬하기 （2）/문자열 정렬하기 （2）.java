import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        String sortString = my_string.toLowerCase();
        char[] C = sortString.toCharArray();
        Arrays.sort(C);
        
        for(char c : C) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
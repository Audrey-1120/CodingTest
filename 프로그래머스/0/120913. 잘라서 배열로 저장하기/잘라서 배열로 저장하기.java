import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        ArrayList<String> answer = new ArrayList<>();
        
        int a = 0; 
        int b = n;
        
        while(a < my_str.length()) { 
            answer.add(my_str.substring(a, b));
            a += n;
            
            if(b + n > my_str.length()) {
                b = my_str.length();
            } else {
                b += n;
            }
            
            
        }
        return answer.stream().toArray(String[]::new);
    }
}
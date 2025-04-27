import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] strs = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strs[i] = Integer.toString(numbers[i]);
        }
    
        Arrays.sort(strs, (a,b) -> (b+a).compareTo(a+b));
    
        for(String s : strs) {
            answer += s;
        }
        
        if(strs[0].equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}
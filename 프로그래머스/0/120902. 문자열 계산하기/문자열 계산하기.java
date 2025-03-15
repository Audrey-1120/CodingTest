import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" ");
        int answer = Integer.parseInt(tokens[0]); // 첫 번째 숫자
        
        for(int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i]; // 연산자
            int num = Integer.parseInt(tokens[i + 1]); // 숫자
            
            if(op.equals("+")) {
                answer += num;
            } else if(op.equals("-")) {
                answer -= num;
            }
        }
        
        return answer;
    }
}
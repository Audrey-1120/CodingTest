import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        
        StringBuilder answer = new StringBuilder();
        
        // 마지막 인덱스
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0 || carry > 0) {
            int b1 = (i >= 0) ? bin1.charAt(i--) - '0' : 0;
            int b2 = (j >= 0) ? bin2.charAt(j--) - '0' : 0;
            
            int sum = b1 + b2 + carry;
            answer.append(sum % 2);
            carry = sum / 2;
        }
        
        return answer.reverse().toString();
    }
}
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length; i++) {
            
            if(i+1 >= phone_book.length) {
                break;
            }
            
            String ph1 = phone_book[i];
            String ph2 = phone_book[i + 1];
            
            if(ph2.startsWith(ph1)) {
                answer = false;
                break;
            }
            
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        
        StringBuilder st = new StringBuilder(new String(ch));
        return Long.parseLong(st.reverse().toString());
    }
}
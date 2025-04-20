class Solution {
    boolean solution(String s) {
        
        int count = 0;
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
            } else {
                count--;
                if(count == -1) break;
            }
        }    
        return count == 0 ? true : false;
    }
}
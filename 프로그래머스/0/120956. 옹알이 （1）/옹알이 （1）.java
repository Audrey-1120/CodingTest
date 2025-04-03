import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] defaultBab = {"aya", "ye", "woo", "ma"};
        
        for(String bab : babbling) {
            String temp = bab;
            for(String deb : defaultBab) {
                temp = temp.replace(deb, " ");
            }
            temp = temp.replace(" ", "");
            if(temp.equals("")) {
                answer++;
            }
            
        }
        
        return answer;
    }
}
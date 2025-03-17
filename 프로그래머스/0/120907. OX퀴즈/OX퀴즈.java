import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(String s : quiz) {
            
            String[] q = s.split(" ");
            int ans = 0;
            
            if(q[1].equals("-")) {
                ans = (Integer.parseInt(q[0])) - (Integer.parseInt(q[2]));
            } else  {
                ans = (Integer.parseInt(q[0])) + (Integer.parseInt(q[2]));
            }
            
            if(ans == Integer.parseInt(q[4])) {
                answer.add("O");
            } else {
                answer.add("X");
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}
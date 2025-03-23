class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        
        String[] pol = polynomial.split(" ");
        
        int xCount = 0; // x 개수
        int con = 0; // 상수항 개수
        
        for(String term : pol) {
            
            if(term.equals("+")) continue;
            
            if(term.contains("x")) {
                
                if(term.equals("x")) {
                    xCount += 1;
                } else {
                    xCount += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                con += Integer.parseInt(term);
            }
        }
        
        
        if(xCount > 0) {
            if(xCount == 1) {
                answer.append("x");
            } else {
                answer.append(xCount).append("x");
            }
        }
        
        if(con > 0) {
            if(xCount > 0) {
                answer.append(" + ");
            }
            answer.append(con);
        }
        
        return answer.toString();
    }
}
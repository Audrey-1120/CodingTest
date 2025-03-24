class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numStr = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(Character.isDigit(c)) {
                numStr += c; // 숫자면 문자열에 추가
            } else {
                if(!numStr.equals("")) {
                    answer += Integer.parseInt(numStr);
                    numStr = ""; // 초기화
                }
            }
        }
        
        if(!numStr.equals("")) {
            answer += Integer.parseInt(numStr);
        }
        
        return answer;
    }
}
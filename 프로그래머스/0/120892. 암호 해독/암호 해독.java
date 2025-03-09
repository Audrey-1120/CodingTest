class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        char[] cipherC = cipher.toCharArray();
        
        for(int i = code-1; i < cipherC.length; i += code) {
            answer.append(cipherC[i]);
        }
        return answer.toString();
    }
}
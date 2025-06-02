class Solution {
    public int[] solution(long n) {
        
        StringBuilder builder = new StringBuilder(String.valueOf(n));
        String answerStr = builder.reverse().toString();
        
        int[] answer = new int[answerStr.length()];
        
        for(int i = 0; i < answerStr.length(); i++) {
            answer[i] = answerStr.charAt(i) - '0';
        }
        
        return answer;
    }
}
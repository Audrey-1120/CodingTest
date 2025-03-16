class Solution {
    public int solution(int num, int k) {
        
        int answer = 0;
        String num2 = String.valueOf(num);
        
        if(num2.indexOf(String.valueOf(k)) != -1) {
            answer = num2.indexOf(String.valueOf(k)) + 1;
        } else {
            answer = -1;
        }
        
        return answer;
    }
}
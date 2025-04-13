class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++) {
            
            String num = String.valueOf(n);
            for(char kNum : num.toCharArray()) {
                if(k == kNum - '0') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
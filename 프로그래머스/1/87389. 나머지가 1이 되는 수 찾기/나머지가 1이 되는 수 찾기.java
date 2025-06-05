class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 시작해서 x로 나눈 나머지 값이 1이 될 경우 바로 멈추기
        for(int i = 1; i < n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
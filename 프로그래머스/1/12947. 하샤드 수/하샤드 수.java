class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int xi = x;
        
        // 자릿수 합 구하기
        while(xi > 0) {
            sum += xi % 10;
            xi /= 10;
        }
        
        return x % sum == 0;
    }
}
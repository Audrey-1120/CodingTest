import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int[] answer = {};
        
        // 홀수의 개수는 n이 짝수일때 n/2(개) / n이 홀수일때 (n+1)/2(개)
        if(n % 2 == 0) {
            answer = new int[n/2];
        } else {
            answer = new int[(n+1)/2];
        }
        
        // n 이하의 홀수 구하기
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}
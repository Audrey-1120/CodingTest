class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        // 1부터 n까지 돌면서 각자의 약수개수를 카운트 하여 3이 넘어가면 answer++한다.
        for(int k = 1; k <= n; k++) {
            
            count = 0;
            
            // 1부터 n까지 돌면서 각각 약수의 개수를 구한다.
            for(int i = 1; i * i <= k; i++) {
                if(i * i == n) {
                    count++;
                } else if(k % i == 0) {
                    count += 2;
                }
            }
            
            // 약수의 개수가 3개 이상일 시 
            if(count >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}
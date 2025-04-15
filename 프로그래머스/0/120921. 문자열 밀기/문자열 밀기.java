class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        int N = A.length();
        
        char[] c = A.toCharArray();
        
        for(int i = 0; i < N; i++) {
            
            if(A.equals(B)) {
                break;
            }
            
            // 맨 앞 숫자 임시 변수에 보관
            char temp = c[0];
            
            // c의 맨 처음 부분에 맨 마지막 숫자 넣기
            c[0] = c[N - 1];
            
            for(int j = N-2; j >= 0; j--) {
                c[j+1] = c[j];
            }
            
            c[1] = temp;
            
            
            if(String.valueOf(c).equals(B)) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        
        
        return answer == -1 ? -1 : answer;
    }
}
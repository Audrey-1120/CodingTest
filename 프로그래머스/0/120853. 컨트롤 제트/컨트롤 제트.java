class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 공백을 기준으로 char 배열로 변환한다.
        String[] a = s.split(" ");
        
        // 반복문 돌면서 더한다.
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals("Z")) {
                answer -= Integer.parseInt(a[i-1]);
            } else {
                answer += Integer.parseInt(a[i]);    
            }
        }
        
        return answer;
    }
}
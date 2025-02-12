class Solution {
    public int solution(int n) {
        
        int answer = 1;
        int slice = answer * 6;
        
        while(slice % n != 0) {
            answer++;
            slice = answer * 6;
        }
        
        return answer;
    }
}
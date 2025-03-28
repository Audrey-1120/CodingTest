class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] pan = new int[200];
        
        for(int[] line : lines) {
            for(int i = (line[0] + 100); i < (line[1] + 100); i++) {
                pan[i]++;
            }
        }
        
        for(int p : pan) {
            if(p > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}
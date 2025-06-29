class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx = x;

        for(int i = 0; i < n; i++) {
            answer[i] = lx;
            lx += x;
        }

        return answer;
    }
}
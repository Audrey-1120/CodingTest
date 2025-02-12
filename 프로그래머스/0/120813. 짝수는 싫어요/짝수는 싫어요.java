class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];

        for (int i = 0, num = 1; num <= n; i++, num += 2) {
            answer[i] = num; 
        }

        return answer;
    }
}
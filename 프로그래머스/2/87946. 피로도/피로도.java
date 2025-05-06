class Solution {
    int answer = 0;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }

    void dfs(int depth, int currentFatigue, int[][] dungeons) {
        
        answer = Math.max(answer, depth);

        for (int i = 0; i < dungeons.length; i++) {
            int required = dungeons[i][0];
            int consume = dungeons[i][1];

            if (!visited[i] && currentFatigue >= required) {
                visited[i] = true;
                dfs(depth + 1, currentFatigue - consume, dungeons);
                visited[i] = false;
            }
        }
    }
}

class Solution {
    
    int answer = 0;    
    
    public int solution(int n, int[][] computers) {

        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, visited, computers);
                answer++;
            }
        }
        return answer;
    }
    
    // 노드 별 방문 여부 - visited
    void dfs(int current, boolean[] visited, int[][] computers) {
        
        // 해당 컴퓨터 방문 했으므로 true
        visited[current] = true;
        
        for(int i = 0; i < computers.length; i++) {
            // 아직 방문 안했고, 연결되어 있는 노드일 경우
            if(!visited[i] && computers[current][i] == 1) {
                dfs(i, visited, computers); // 여기서 연결되어 있는 노드 한번에 방문 후,
            }
        }
    }
}
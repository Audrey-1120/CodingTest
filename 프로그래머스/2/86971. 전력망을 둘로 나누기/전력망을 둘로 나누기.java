import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        
        int answer = n;
        
        // 그래프 생성
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        // 간선 하나씩 끊어보면서 비교하기
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph.get(a).remove(Integer.valueOf(b));
            graph.get(b).remove(Integer.valueOf(a));
            
            boolean[] visited = new boolean[n + 1];
            int count = dfs(a, visited, graph);
            int other = n - count;
            
            answer = Math.min(answer, Math.abs(other - count));
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return answer;
    }
    
    // 연결된 송전탑 개수 세기
    private int dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        
        visited[node] = true; // 현재 노드 방문했다고 체크.
        int count = 1; // 자기 자신 포함해서 1개
        
        for(int next : graph.get(node)) {
            if(!visited[next]) { // 방문 안한 경우
                count += dfs(next, visited, graph);
            }
        }
        return count;
    }
}
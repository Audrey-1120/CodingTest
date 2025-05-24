import java.util.*;

class Solution {
    List<String> answer = null;
    
    public String[] solution(String[][] tickets) {
        boolean[] visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            }
            return a[0].compareTo(b[0]);
        });
        
        List<String> route = new ArrayList<>();
        route.add("ICN");
        dfs("ICN", tickets, visited, route);
        
        return answer.toArray(new String[0]);
    }
    
    void dfs(String current, String[][] tickets, boolean[] visited, List<String> route) {
        if (route.size() == tickets.length + 1) {
            if (answer == null) {
                answer = new ArrayList<>(route);
            }
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                route.add(tickets[i][1]);
                dfs(tickets[i][1], tickets, visited, route);
                visited[i] = false;
                route.remove(route.size() - 1);
            }
        }
    }
}

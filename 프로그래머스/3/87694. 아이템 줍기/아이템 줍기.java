import java.util.*;

class Solution {
    static boolean[][] map = new boolean[102][102];
    static boolean[][] visited = new boolean[102][102];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
        for(int[] rec : rectangle) {
            int x1 = rec[0] * 2, y1 = rec[1] * 2;
            int x2 = rec[2] * 2, y2 = rec[3] * 2;
            
            for(int i = x1; i <= x2; i++) {
                for(int j = y1; j <= y2; j++) {
                    map[i][j] = true;
                }
            }
        }
        
        for(int[] rec : rectangle) {
            int x1 = rec[0] * 2, y1 = rec[1] * 2;
            int x2 = rec[2] * 2, y2 = rec[3] * 2;
            
            for(int i = x1 + 1; i < x2; i++) {
                for(int j = y1 + 1; j < y2; j++) {
                    map[i][j] = false;
                }
            }
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{characterX * 2, characterY * 2, 0});
        visited[characterX * 2][characterY * 2] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], dist = cur[2];
            
            if(x == itemX * 2 && y == itemY * 2) {
                return dist / 2;
            }
            
            for(int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (map[nx][ny] && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return 0;
    }
}
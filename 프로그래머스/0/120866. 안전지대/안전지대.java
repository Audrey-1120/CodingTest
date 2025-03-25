class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        int[][] dangerZone = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                
                if(board[i][j] == 1) { // 지뢰일 경우
                    
                    for(int dx = -1; dx <= 1; dx++) {
                        for(int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx;
                            int ny = j + dy;
                            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                dangerZone[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(dangerZone[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
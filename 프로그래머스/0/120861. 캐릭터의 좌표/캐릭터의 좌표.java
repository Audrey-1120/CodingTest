class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        
        int halfX = (board[0] - 1) / 2;
        int halfY = (board[1] - 1) / 2;
        
        for(int i = 0; i < keyinput.length; i++) {
            
            if(keyinput[i].equals("up")) {
                if(y != halfY) {
                    y++;
                }
            } else if(keyinput[i].equals("down")) {
                if(y != halfY * -1) {
                    y--;
                }
            } else if(keyinput[i].equals("right")) {
                if(x != halfX) {
                    x++;
                }
            } else {
                if(x != halfX * -1) {
                    x--;
                }
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
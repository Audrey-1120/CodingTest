class Solution {
    public String solution(String[] id_pw, String[][] db) {
        StringBuilder answer = new StringBuilder();
        int[] check = new int[2];
        
        for(int i = 0; i < db.length; i++) {
            
            if(db[i][0].equals(id_pw[0])) {
                check[0]++; 
                if(db[i][1].equals(id_pw[1])) {
                    check[1]++;
                }
            }
        }
        
        if(check[0] > 0 && check[1] > 0) {
            answer.append("login");
        } else if(check[0] > 0 && check[1] == 0) {
            answer.append("wrong pw");
        } else {
            answer.append("fail");
        }
            
        return answer.toString();
    }
}
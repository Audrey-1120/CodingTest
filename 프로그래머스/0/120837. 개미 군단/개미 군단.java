class Solution {
    public int solution(int hp) {
        int answer = 0;
        int G, B, I = 0;
        
        if(hp >= 5) {
            
            G = hp / 5;
            B = (hp - G*5) / 3;
            I = (hp - G*5 - B*3) / 1;
            answer = G + B + I;
            
        } else if(hp < 5 && hp >= 3) {
            
            B = hp / 3;
            I = hp - B*3;
            answer = B + I;
            
        } else {
            answer = hp;
        }
        
        return answer;
    }
}
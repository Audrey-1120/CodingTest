import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int a = sides[0];
        int b = sides[1];
        
        // 1. 최댓값이 b(sides[1]) 인 경우
        for(int i = b - a + 1; i <= b; i++) {
            answer++;
        }
        
        // 2. 최댓값이 c인 경우
        for(int i = b + 1; i < a + b; i++) {
            answer++;
        }
        
        return answer;
    }
}
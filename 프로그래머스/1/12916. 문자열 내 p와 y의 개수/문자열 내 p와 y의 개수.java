class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(char c : s.toCharArray()) {
            if(Character.toLowerCase(c) == 'p') {
                pCount++;
            } else if(Character.toLowerCase(c) == 'y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
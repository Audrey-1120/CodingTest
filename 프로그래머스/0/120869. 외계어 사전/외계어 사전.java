class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String word : dic) {
            int count = 0;
            for(String sp : spell) {
                if(word.contains(sp)) {
                    count++;
                } 
            }
            answer = count == spell.length ? 1 : 2;
            
            if(answer == 1) {
                break;
            }
        }
        return answer;
    }
}
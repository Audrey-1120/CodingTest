class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for(String c : vowels) {
            answer = answer.replaceAll(c, "");
        }
        
        return answer;
    }
}
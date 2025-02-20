class Solution {
    public String solution(int age) {
        
        StringBuilder builder = new StringBuilder();
        String eng = "abcdefghij";
        String ageArr = String.valueOf(age);
        
        for(char c : ageArr.toCharArray()) {
            builder.append(eng.charAt(c - '0'));
        }
        
        return builder.toString();
        
    }
}
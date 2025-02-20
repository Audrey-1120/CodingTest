class Solution {
    public String solution(int age) {
        StringBuilder builder = new StringBuilder();
        
        String eng = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i = 0; i < ageArr.length; i++) {
            builder.append(eng.charAt(Integer.valueOf(ageArr[i])));
        }
        
        return builder.toString();
    }
}
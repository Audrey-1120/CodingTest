class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder answer = new StringBuilder();
        
        char[] my_char = my_string.toCharArray();
        
        char temp;
        temp = my_char[num1];
        my_char[num1] = my_char[num2];
        my_char[num2] = temp;
        
        for(char c : my_char) {
            answer.append(String.valueOf(c));
        }
        
        return answer.toString();
    }
}
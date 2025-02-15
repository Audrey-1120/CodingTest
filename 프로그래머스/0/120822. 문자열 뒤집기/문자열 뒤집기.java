class Solution {
    public String solution(String my_string) {
        
    String answer = "";
    StringBuilder builder = new StringBuilder();
    
    char[] eng = new char[my_string.length()];
    
    for(int i = 0; i < eng.length; i++) {
      eng[i] = my_string.charAt(i);
    }
    
    for(int j = eng.length - 1; j >= 0; j--) {
      builder.append(eng[j]); 
    }
    
    return builder.toString();
    }
}
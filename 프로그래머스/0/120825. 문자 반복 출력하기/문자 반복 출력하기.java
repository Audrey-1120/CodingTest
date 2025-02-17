class Solution {
    public String solution(String my_string, int n) {
        
        char[] A = my_string.toCharArray();
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < n; j++) {
                builder.append(A[i]);
            }
        }
        
        return builder.toString();
    }
}
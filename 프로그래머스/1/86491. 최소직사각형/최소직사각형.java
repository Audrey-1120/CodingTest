import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int answer = 0;
        int n = sizes.length;
        
        int[] widths = new int[n];
        int[] heights = new int[n];
        
        for(int i = 0; i < sizes.length; i++) {
            
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            if(a < b) {
                widths[i] = a;
                heights[i] = b;
            } else {
                widths[i] = b;
                heights[i] = a;
            }
        }
        
        Arrays.sort(widths);
        Arrays.sort(heights);
        
        return widths[n - 1] * heights[n - 1];
    }
}
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {

        Arrays.sort(array);
        
        int closest = array[0];
        
        for(int num : array) {
            if(Math.abs(num - n) < Math.abs(closest - n) ||
              (Math.abs(num - n) == Math.abs(closest - n) && num < closest)) {
                closest = num;
            }
        }
        
        return closest;
    }
}
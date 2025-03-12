import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
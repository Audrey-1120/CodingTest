import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num); // 중복 없이 종류 세기
        }
        
        int maxPick = nums.length / 2;
        
        return Math.min(set.size(), maxPick);
    }
}
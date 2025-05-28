import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int sco : scoville) {
            pq.offer(sco); // 모든 음식 스코빌 지수 추가
        }
        
        int count = 0;
        
        while(pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll(); // 가장 맵지 않은 음식
            int second = pq.poll(); // 두번째로 맵지 않은 음식
            
            int newFood = first + (second * 2);
            pq.offer(newFood);
            count++;
        }
        
        // 모든 음식이 K이상인가?
        if(pq.peek() < K) return -1;
        
        return count;
    }
}
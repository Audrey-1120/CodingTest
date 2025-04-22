import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Pair> q = new LinkedList<>();
        
        int time = 0;
        int i = 0;
        int sum = 0;
        
        while(i < truck_weights.length || !q.isEmpty()) {
            
            if(!q.isEmpty() && time - q.peek().time >= bridge_length) {
                sum -= q.poll().truck;
                answer++;
            }            
            
            if(i < truck_weights.length && sum + truck_weights[i] <= weight) {

                q.add(new Pair(time, truck_weights[i]));
                sum += truck_weights[i]; // 현재 다리에 올라가 있는 트럭 무게 
                i++; // 트럭 인덱스++;
            } 

            time++; // 경과 시간 ++;
            
        } 
        
        return time;
    }
}

class Pair {
    int time;
    int truck;
    
    Pair(int time, int truck) {
        this.time = time;
        this.truck = truck;
    }
}
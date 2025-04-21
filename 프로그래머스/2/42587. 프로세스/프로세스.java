import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // queue 초기화
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            q.add(new Pair(i, priorities[i]));
        }
        
        while(!q.isEmpty()) {
            
            Pair now = q.poll(); // 현재 프로세스 꺼내기
            
            boolean HasMax = false;
            for(Pair p : q) {
                if(p.priority > now.priority) {
                    HasMax = true;
                    break;
                }
            }
            
            if(HasMax) {
                q.add(now);
            } else {
                answer++;
                if(now.index == location) {
                    break;
                }
            }   
        }
        
        return answer;
    }
    
}
    
    
class Pair implements Comparable<Pair> {
    int index, priority;

    Pair(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
    
    public int compareTo(Pair p) {
        return -1;
    }
}


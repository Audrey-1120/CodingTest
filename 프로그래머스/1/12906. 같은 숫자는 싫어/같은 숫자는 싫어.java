import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[0]);
        answer.add(arr[0]);
        
        for(int a : arr) {
            if(st.peek() != a) {
                answer.add(a);
                st.push(a);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
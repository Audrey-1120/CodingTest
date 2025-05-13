import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(String com : completion) {
            map.put(com, map.getOrDefault(com, 0) + 1);
        }
        
        for(String par : participant) {
            
            // 값 존재할 경우
            if(map.containsKey(par) != false) {
                
                if(map.get(par) == 0) {
                    // 값이 존재하는데 value값이 0인 경우 (완주못한 동명이인)
                    answer = par;
                    break;
                } else {
                    // 값이 존재하고 value값이 1인 경우 (완주자)
                    map.put(par, map.get(par) - 1);
                }
            } else {
                // 값이 존재하지 않을 경우 (완주자 아님)
                answer = par;
                break;
            }
        }

        return answer;
    }
}
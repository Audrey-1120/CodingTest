import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> playCount = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            playCount.put(genres[i], playCount.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(playCount.entrySet());
        genreList.sort((a, b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<String, Integer> entry : genreList) {
            
            String key = entry.getKey();
            int index = 0;
            List<int[]> best = new ArrayList<>();
            
            for(int i = 0; i < genres.length; i++) {
                if(genres[i].equals(key)) {
                    best.add(new int[]{i, plays[i]});
                }
            }
            
            best.sort((a, b) -> b[1] - a[1]);
            answer.add(best.get(0)[0]);
            
            if(best.size() >= 2) {
                answer.add(best.get(1)[0]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
class Solution {
    
    int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        
        boolean[] visited = new boolean[words.length];
        boolean hasTarget = false;
        
        // words에 target 있는지 확인
        for(String word : words) {
            if(word.equals(target)) {
                hasTarget = true;
                break;
            }
        }
        
        if(!hasTarget) {
            return 0;
        }
        
        dfs(begin, target, words, visited, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    void dfs(String begin, String target, String[] words, boolean[] visited, int count) {
        
        // 종료 조건
        if(begin.equals(target)) {
            answer = Math.min(answer, count);
            return;
        }
        
        for(int i = 0; i < words.length; i++) {
            if(!visited[i] && isOneCharDiff(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, count + 1);
                visited[i] = false;
            }
        }
        
    }
    
    boolean isOneCharDiff(String a, String b) {
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
            if(count > 1) return false;
        }
        return count == 1;
    }
}
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int c1 = common[1] - common[0];
        int c2 = common[2] - common[1];
        int last = common[common.length - 1];
        
        if(c1 == c2) { // 등차수열
            answer = last + c1;
        } else { // 등비수열
            answer = last * common[1] / common[0];
        }
        
        return answer;
    }
}
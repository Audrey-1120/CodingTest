class Solution {
    public int solution(int order) {
        
        char[] a = {'3', '6', '9'};
        String order2 = String.valueOf(order);
        int count = 0;
        
        for(char c : order2.toCharArray()) { // 문자열의 각 문자 탐색
            for(char target : a) { // 배열 내의 문자와 비교
                if(c == target) {
                    count++;
                    break; // 이미 찾았으면 더 비교할 필요 없음
                }
            }
        }
        return count;
    }
}
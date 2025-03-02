import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 정렬한다.
        Arrays.sort(numbers);
        
        // 끝의 최댓값 구한다.
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        
        // 원소의 개수를 저장하는 배열의 길이를 정하기 위한 array의 최댓값 구하기
        
        Arrays.sort(array); // 배열 오름차순 
        int max = array[array.length - 1]; // 제일 마지막 요소가 최댓값
        
        int[] array2 = new int[max + 1]; // 최댓값 + 1의 길이로 배열 선언
        
        for(int i = 0; i < array.length; i++) { // 원소의 개수대로 배열 값 채우기
            array2[array[i]]++;
        }
        
        int mode = array2[0]; // 최빈값이 몇번 등장했는지 저장
        
        for(int j = 1; j < array2.length; j++) { // array2는 숫자 0 ~ max의 빈도수 저장한 배열
            if(mode < array2[j]) { // 더 높은 빈도수 발견 시 mode 업데이트
                mode = array2[j]; 
                answer = j; // 최빈 값을 해당 숫자로 갱신한다.
            } else if(mode == array2[j]) { // 최빈값이 여러개일 경우
                answer = -1; // -1 반환
            }
        }
        return answer;
    }
}
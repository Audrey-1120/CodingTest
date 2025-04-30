import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == stu1[i % stu1.length]) score[0]++;
            if(answers[i] == stu2[i % stu2.length]) score[1]++;
            if(answers[i] == stu3[i % stu3.length]) score[2]++;
        }
        
        int max = Arrays.stream(score).max().getAsInt();
        
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) answer.add(i + 1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
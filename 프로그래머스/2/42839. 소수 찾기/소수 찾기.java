import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        Set<Integer> numberList = new HashSet<>();
        makeNumbers("", numbers, numberList);
        
        for(int number : numberList) {
            if(isPrime(number)) {
                answer++;
            }
        }
        return answer;
    }
    
    boolean isPrime(int n) {
        if(n < 2) return false;
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
    
    void makeNumbers(String prefix, String remaining, Set<Integer> results) {
        if(!prefix.isEmpty()) {
            results.add(Integer.parseInt(prefix));
        }
        for(int i = 0; i < remaining.length(); i++) {
            makeNumbers(
                prefix + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1),
                results
            );
        }
    }
    
}
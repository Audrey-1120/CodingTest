import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        int gcdNum = gcd(a, b); // 최대공약수
        int decimal = b / gcdNum; // 기약분수의 분모
        
        // decimal을 소인수 분해해서 2와 5만 있는지 확인한다.
        while(decimal % 2 == 0) {
            decimal /= 2;
        }
        
        while(decimal % 5 == 0) {
            decimal /= 5;
        }
        
        return decimal == 1 ? 1 : 2;
    }
    
    public static int gcd(int a , int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
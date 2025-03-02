import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        return factorial(n);
    }
    
    public static int factorial(int n) {
        
        BigInteger result = BigInteger.ONE;
        int num = 0;
        
        for(int i = 1;  ;i++) {
            
            result = result.multiply(BigInteger.valueOf(i));
            
            if(result.compareTo(BigInteger.valueOf(n)) > 0) {
                return num;
            }
            
            num = i;
            
        }
    }
}
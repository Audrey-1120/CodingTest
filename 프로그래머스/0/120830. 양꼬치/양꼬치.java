class Solution {
    public int solution(int n, int k) {
        
        k = (n / 10) > 0 ? k - n / 10 : n;
        return n * 12000 + k * 2000;
    }
}
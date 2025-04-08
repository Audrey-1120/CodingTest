class Solution {
    public int solution(int chicken) {

        int service = 0;
        int coupon = chicken;
        
        while(coupon >= 10) {
            int newChicken = coupon / 10;
            service += newChicken;
            coupon = (coupon % 10) + newChicken;
        }
        
        return service;
        
    }

}
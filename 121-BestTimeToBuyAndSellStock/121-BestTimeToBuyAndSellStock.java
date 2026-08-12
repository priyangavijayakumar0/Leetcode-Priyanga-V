// Last updated: 8/12/2026, 12:35:42 PM
class Solution {
    public int maxProfit(int[] prices) {
         int mprice = Integer.MAX_VALUE;
        int mprofit = 0;

        for (int price : prices) {
            if (price < mprice) {
                mprice = price; 
            } else if (price - mprice > mprofit) {
                mprofit = price - mprice; 
            }
        }
        return mprofit;
    }
}
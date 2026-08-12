// Last updated: 8/12/2026, 12:36:34 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
        
    }
}
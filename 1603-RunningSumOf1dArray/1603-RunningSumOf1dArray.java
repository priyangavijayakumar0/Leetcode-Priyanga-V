// Last updated: 8/12/2026, 12:30:06 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int  i;
        for(i=1;i<n;i++)
        {
            nums[i]=nums[i]+nums[i-1];
              
        }   
           return nums;   
    }
}
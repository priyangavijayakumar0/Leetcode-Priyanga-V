// Last updated: 8/12/2026, 12:28:34 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            int val=nums[n-1-i];
            long currentmul=Math.max(1L,(long) mul-i);
            ans+=val*currentmul;
        }
        return ans;
    }
}
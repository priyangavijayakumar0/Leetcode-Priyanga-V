// Last updated: 8/12/2026, 12:33:42 PM
class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    int sum=0,i;
    for(i=0;i<n;i++)
       sum+=nums[i];
    int res=n*(n+1)/2;
    return res-sum;    
    }
}
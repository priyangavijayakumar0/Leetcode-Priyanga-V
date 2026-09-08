// Last updated: 9/8/2026, 10:05:38 AM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) return 0; 
4        int prod=1,left=0,count=0;
5
6        for(int right=0;right<nums.length;right++){
7            prod*=nums[right];
8            while(prod >=k){
9                prod/=nums[left++];
10            }count+=right-left+1;
11        }
12        return count;
13    }
14}
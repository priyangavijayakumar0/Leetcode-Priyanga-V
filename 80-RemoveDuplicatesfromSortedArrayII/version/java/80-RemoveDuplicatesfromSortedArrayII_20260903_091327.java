// Last updated: 9/3/2026, 9:13:27 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int n:nums){
5            if(i<2 || n>nums[i-2]){
6                nums[i]=n;
7                i++;
8            }
9        }return i;
10        
11    }
12}
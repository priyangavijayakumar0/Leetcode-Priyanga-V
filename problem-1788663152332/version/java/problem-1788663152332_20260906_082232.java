// Last updated: 9/6/2026, 8:22:32 AM
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n=nums.length,h=n/2;
4        long t=0,s=0;
5        for(int x:nums)t+=x;
6        for(int i=0;i<h;i++)s+=nums[i];
7        int c=0;
8        for(int i=0;i<n;i++){
9            if(s>t-s)c++;
10            s-=nums[i];
11            s+=nums[(i+h)%n];
12        }
13        return c++;
14        
15    }
16}
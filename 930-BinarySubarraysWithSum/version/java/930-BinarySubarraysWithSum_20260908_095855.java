// Last updated: 9/8/2026, 9:58:55 AM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        Map<Integer ,Integer>count=new HashMap<>();
4        count.put(0,1);
5        int sum=0,res=0;
6        for(int n:nums){
7            sum+=n;
8            res+=count.getOrDefault(sum-goal,0);
9            count.put(sum,count.getOrDefault(sum,0)+1);
10
11        }
12        return res;
13        
14    }
15}
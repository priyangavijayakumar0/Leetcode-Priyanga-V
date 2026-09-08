// Last updated: 9/8/2026, 9:54:00 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left=0,right=0,zero=0,maxlen=0;
4        while(right <nums.length){
5            if(nums[right]==0)
6            zero++;
7            while(zero>k){
8                if(nums[left]==0)
9                zero--;
10                left++;
11            }
12            maxlen=Math.max(maxlen,right-left+1);
13            right++;
14        }
15        return maxlen;
16        
17    }
18}
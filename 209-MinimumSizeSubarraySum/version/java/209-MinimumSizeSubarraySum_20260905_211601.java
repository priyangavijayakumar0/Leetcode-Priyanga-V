// Last updated: 9/5/2026, 9:16:01 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length, left = 0, sum = 0, minLen = Integer.MAX_VALUE;
4        for (int right = 0; right < n; right++) {
5            sum += nums[right];
6            while (sum >= target) {
7                minLen = Math.min(minLen, right - left + 1);
8                sum -= nums[left++];
9            }
10        }
11        return minLen == Integer.MAX_VALUE ? 0 : minLen;
12    }
13}
14
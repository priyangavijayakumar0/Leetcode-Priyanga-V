// Last updated: 9/11/2026, 9:07:24 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0, maxCount = 0;
4        for (int num : nums) {
5            if (num == 1) {
6                count++;
7                maxCount = Math.max(maxCount, count);
8            } else {
9                count = 0;
10            }
11        }
12        return maxCount;
13    }
14}
15
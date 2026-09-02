// Last updated: 9/2/2026, 9:57:12 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = left + (right - left) / 2;
6            if (mid % 2 == 1) mid--;
7
8            if (nums[mid] == nums[mid + 1]) {
9                left = mid + 2; 
10            } else {
11                right = mid;    
12            }
13        }
14        return nums[left];
15    }
16}
17
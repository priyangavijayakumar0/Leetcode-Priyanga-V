// Last updated: 9/2/2026, 9:50:00 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            if (nums[mid] == target) return true;
8            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
9                left++;
10                right--;
11            } else if (nums[left] <= nums[mid]) {
12                if (nums[left] <= target && target < nums[mid]) {
13                    right = mid - 1;
14                } else {
15                    left = mid + 1;
16                }
17            } else {
18                if (nums[mid] < target && target <= nums[right]) {
19                    left = mid + 1;
20                } else {
21                    right = mid - 1;
22                }
23            }
24        }
25        return false;
26    }
27}
28
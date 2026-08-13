// Last updated: 8/13/2026, 7:09:36 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
6            map.put(nums[i], i);
7        }
8        return false;
9    }
10}
11
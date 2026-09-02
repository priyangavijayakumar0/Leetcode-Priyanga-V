// Last updated: 9/2/2026, 9:52:30 AM
1import java.util.*;
2class Solution {
3    public int subarraysWithKDistinct(int[] nums, int k) {
4        return atMostK(nums, k) - atMostK(nums, k - 1);
5    }
6    private int atMostK(int[] nums, int k) {
7        Map<Integer, Integer> freq = new HashMap<>();
8        int left = 0, res = 0;
9        for (int right = 0; right < nums.length; right++) {
10            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
11            while (freq.size() > k) {
12                freq.put(nums[left], freq.get(nums[left]) - 1);
13                if (freq.get(nums[left]) == 0) {
14                    freq.remove(nums[left]);
15                }
16                left++;
17            }
18            res += right - left + 1; 
19        }
20        return res;
21    }
22}
23
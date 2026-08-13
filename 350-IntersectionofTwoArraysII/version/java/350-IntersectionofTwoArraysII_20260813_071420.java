// Last updated: 8/13/2026, 7:14:20 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int n : nums1) map.put(n, map.getOrDefault(n, 0) + 1);
5        List<Integer> res = new ArrayList<>();
6        for (int n : nums2)
7            if (map.getOrDefault(n, 0) > 0) {
8                res.add(n);
9                map.put(n, map.get(n) - 1);
10            }
11        return res.stream().mapToInt(i -> i).toArray();
12    }
13}
14
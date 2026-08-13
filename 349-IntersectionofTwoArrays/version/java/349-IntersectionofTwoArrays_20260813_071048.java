// Last updated: 8/13/2026, 7:10:48 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3    Set<Integer> set1 = new HashSet<>();
4    for (int n : nums1) set1.add(n);
5    Set<Integer> res = new HashSet<>();
6    for (int n : nums2) if (set1.contains(n)) res.add(n);
7    return res.stream().mapToInt(i -> i).toArray();
8}
9
10}
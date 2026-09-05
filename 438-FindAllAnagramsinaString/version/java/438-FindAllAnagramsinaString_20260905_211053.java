// Last updated: 9/5/2026, 9:10:53 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4        int n = s.length(), m = p.length();
5        if (n < m) return ans;
6        int[] need = new int[26], win = new int[26];
7        for (char c : p.toCharArray()) need[c - 'a']++;
8        int left = 0;
9        for (int right = 0; right < n; right++) {
10            win[s.charAt(right) - 'a']++;
11            if (right - left + 1 > m) {
12                win[s.charAt(left) - 'a']--;
13                left++;
14            }
15            if (right - left + 1 == m && Arrays.equals(need, win)) {
16                ans.add(left);
17            }
18        }
19        return ans;
20    }
21}
22
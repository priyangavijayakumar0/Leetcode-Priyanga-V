// Last updated: 9/5/2026, 9:14:34 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n = s1.length(), m = s2.length();
4        if (n > m) return false;
5
6        int[] need = new int[26], win = new int[26];
7        for (char c : s1.toCharArray()) need[c - 'a']++;
8
9        int left = 0;
10        for (int right = 0; right < m; right++) {
11            win[s2.charAt(right) - 'a']++;
12            if (right - left + 1 > n) {
13                win[s2.charAt(left) - 'a']--;
14                left++;
15            }
16            if (Arrays.equals(need, win)) return true;
17        }
18        return false;
19    }
20}
21
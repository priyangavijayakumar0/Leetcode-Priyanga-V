// Last updated: 9/30/2026, 10:07:16 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = haystack.length();
4        int m = needle.length();
5
6        for (int i = 0; i <= n - m; i++) {
7            if (haystack.substring(i, i + m).equals(needle)) {
8                return i; // Found match
9            }
10        }
11
12        return -1; // No match found
13    }
14}
15
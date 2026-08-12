// Last updated: 8/12/2026, 4:24:53 PM
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] freq = new int[26];
4        for (String w : words) {
5            for (char c : w.toCharArray()) {
6                freq[c - 'a']++;
7            }
8        }
9        int n = words.length;
10        for (int f : freq) {
11            if (f % n != 0) return false;
12        }
13        return true;
14    }
15}
16
// Last updated: 8/12/2026, 4:18:45 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        if (n <= 8) return n;
5        if (n <= 16) return 8 + (n - 8) * 2;
6        if (n <= 24) return 8 + 16 + (n - 16) * 3;
7        return 8 + 16 + 24 + (n - 24) * 4;
8    }
9}
10
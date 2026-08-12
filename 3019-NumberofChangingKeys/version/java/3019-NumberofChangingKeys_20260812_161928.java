// Last updated: 8/12/2026, 4:19:28 PM
1class Solution {
2    public int countKeyChanges(String s) {
3        int changes = 0;
4        for (int i = 1; i < s.length(); i++) {
5            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
6                changes++;
7            }
8        }
9        return changes;
10    }
11}
12
// Last updated: 8/12/2026, 4:29:02 PM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        boolean[] seen = new boolean[26];
4        for (char c : sentence.toCharArray()) {
5            seen[c - 'a'] = true;
6        }
7        for (boolean b : seen) {
8            if (!b) return false;
9        }
10        return true;
11    }
12}
13
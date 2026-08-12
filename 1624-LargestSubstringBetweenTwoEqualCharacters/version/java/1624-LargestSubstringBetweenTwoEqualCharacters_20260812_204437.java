// Last updated: 8/12/2026, 8:44:37 PM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int[] firstIndex = new int[26];
4        Arrays.fill(firstIndex, -1);
5        int maxLen = -1;
6
7        for (int i = 0; i < s.length(); i++) {
8            int idx = s.charAt(i) - 'a';
9            if (firstIndex[idx] == -1) {
10                firstIndex[idx] = i;
11            } else {
12                maxLen = Math.max(maxLen, i - firstIndex[idx] - 1);
13            }
14        }
15        return maxLen;
16    }
17}
18
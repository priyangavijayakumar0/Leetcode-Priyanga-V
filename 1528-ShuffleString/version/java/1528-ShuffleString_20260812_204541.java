// Last updated: 8/12/2026, 8:45:41 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] result = new char[s.length()];
4        for (int i = 0; i < s.length(); i++) {
5            result[indices[i]] = s.charAt(i);
6        }
7        return new String(result);
8    }
9}
10
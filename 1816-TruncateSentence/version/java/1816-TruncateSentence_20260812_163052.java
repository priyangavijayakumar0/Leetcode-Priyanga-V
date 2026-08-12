// Last updated: 8/12/2026, 4:30:52 PM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] words = s.split(" ");
4        StringBuilder sb = new StringBuilder();
5        for (int i = 0; i < k; i++) {
6            if (i > 0) sb.append(" ");
7            sb.append(words[i]);
8        }
9        return sb.toString();
10    }
11}
12
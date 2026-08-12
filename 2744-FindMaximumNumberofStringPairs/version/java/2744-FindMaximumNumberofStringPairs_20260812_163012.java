// Last updated: 8/12/2026, 4:30:12 PM
1class Solution {
2    public int maximumNumberOfStringPairs(String[] words) {
3        int count = 0;
4        for (int i = 0; i < words.length; i++) {
5            for (int j = i + 1; j < words.length; j++) {
6                StringBuilder sb = new StringBuilder(words[j]);
7                if (words[i].equals(sb.reverse().toString())) {
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14}
15
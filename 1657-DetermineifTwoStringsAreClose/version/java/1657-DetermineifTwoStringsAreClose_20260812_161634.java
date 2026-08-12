// Last updated: 8/12/2026, 4:16:34 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if (word1.length() != word2.length()) return false;
4
5        int[] freq1 = new int[26];
6        int[] freq2 = new int[26];
7
8        for (char c : word1.toCharArray()) freq1[c - 'a']++;
9        for (char c : word2.toCharArray()) freq2[c - 'a']++;
10
11        for (int i = 0; i < 26; i++) {
12            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0))
13                return false;
14        }
15
16        Arrays.sort(freq1);
17        Arrays.sort(freq2);
18
19        return Arrays.equals(freq1, freq2);
20    }
21}
22
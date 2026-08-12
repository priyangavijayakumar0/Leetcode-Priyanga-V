// Last updated: 8/12/2026, 4:27:18 PM
1class Solution {
2    public String sortSentence(String s) {
3        String[] parts = s.split(" ");
4        String[] result = new String[parts.length];
5        
6        for (String word : parts) {
7            int pos = word.charAt(word.length() - 1) - '0';
8            result[pos - 1] = word.substring(0, word.length() - 1);
9        }
10        
11        return String.join(" ", result);
12    }
13}
14
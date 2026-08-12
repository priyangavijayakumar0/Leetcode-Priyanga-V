// Last updated: 8/12/2026, 8:43:56 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int n = s.length();
4        int mid = n / 2;
5        return countVowels(s.substring(0, mid)) == countVowels(s.substring(mid));
6    }
7
8    private int countVowels(String str) {
9        int count = 0;
10        for (char c : str.toCharArray()) {
11            if ("aeiouAEIOU".indexOf(c) != -1) {
12                count++;
13            }
14        }
15        return count;
16    }
17}
18
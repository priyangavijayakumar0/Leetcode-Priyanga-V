// Last updated: 8/12/2026, 4:18:14 PM
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> result = new ArrayList<>();
4        for (int i = 0; i < words.length; i++) {
5            if (words[i].indexOf(x) != -1) {
6                result.add(i);
7            }
8        }
9        return result;
10    }
11}
12
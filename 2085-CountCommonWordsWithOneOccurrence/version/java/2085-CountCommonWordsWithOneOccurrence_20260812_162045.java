// Last updated: 8/12/2026, 4:20:45 PM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        Map<String, Integer> map1 = new HashMap<>();
4        Map<String, Integer> map2 = new HashMap<>();
5
6        for (String w : words1) map1.put(w, map1.getOrDefault(w, 0) + 1);
7        for (String w : words2) map2.put(w, map2.getOrDefault(w, 0) + 1);
8
9        int count = 0;
10        for (String w : map1.keySet()) {
11            if (map1.get(w) == 1 && map2.getOrDefault(w, 0) == 1) {
12                count++;
13            }
14        }
15        return count;
16    }
17}
18
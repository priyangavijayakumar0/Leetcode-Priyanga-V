// Last updated: 8/13/2026, 11:26:06 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int sum = 0;
4        int[] count = new int[26];
5
6        for(int i = 0; i < word.length(); i++) {
7            char ch = word.charAt(i);
8            count[ch - 'a']++;
9        }
10
11
12        for(int i = 0; i < 26; i++) {
13            for(int j = i + 1; j < 26; j++) {
14                if(count[i] < count[j]) {
15                    int temp = count[i];
16                    count[i] = count[j];
17                    count[j] = temp;
18                }
19            }
20        }
21
22        for(int i = 0; i < 26; i++) {
23            if(count[i] == 0)
24                break;
25
26            if(i < 8) {
27                sum = sum + count[i] * 1;
28            }
29            else if(i < 16) {
30                sum = sum + count[i] * 2;
31            }
32            else if(i < 24) {
33                sum = sum + count[i] * 3;
34            }
35            else {
36                sum = sum + count[i] * 4;
37            }
38        }
39
40        return sum;
41    }
42}
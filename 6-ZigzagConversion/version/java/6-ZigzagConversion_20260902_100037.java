// Last updated: 9/2/2026, 10:00:37 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1) return s;
4        StringBuilder[] rows = new StringBuilder[numRows];
5        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
6        int row = 0;
7        boolean goingDown = false;
8        for (char c : s.toCharArray()) {
9            rows[row].append(c);
10            if (row == 0 || row == numRows - 1) goingDown = !goingDown;
11            row += goingDown ? 1 : -1;
12        }
13        StringBuilder result = new StringBuilder();
14        for (StringBuilder sb : rows) result.append(sb);
15        return result.toString();
16    }
17}
18
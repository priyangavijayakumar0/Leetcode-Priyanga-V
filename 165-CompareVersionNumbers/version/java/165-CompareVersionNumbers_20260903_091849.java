// Last updated: 9/3/2026, 9:18:49 AM
1class Solution {
2    public int compareVersion(String v1, String v2) {
3      String[] a = v1.split("\\.");
4        String[] b = v2.split("\\.");
5        int n = Math.max(a.length, b.length);
6
7        for (int i = 0; i < n; i++) {
8            int x=i<a.length?Integer.parseInt(a[i]):0;
9            int y=i<b.length?Integer.parseInt(b[i]):0;
10
11            if (x<y) return -1;
12            if (x>y) return 1;
13        }
14        return 0;
15        
16    }
17}
// Last updated: 9/30/2026, 10:08:15 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n=haystack.length(),m=needle.length();
4        for(int i=0;i<=n-m;i++){
5            if(haystack.substring(i,i+m).equals(needle)){
6                return i;
7            }
8        }
9        return -1;
10    }
11}
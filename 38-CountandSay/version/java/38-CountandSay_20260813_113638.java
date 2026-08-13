// Last updated: 8/13/2026, 11:36:38 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s="1";
4        for(int i=1;i<n;i++){
5            String ans="";
6            int count=1;
7            for(int j=1;j<s.length();j++) {
8                if(s.charAt(j)==s.charAt(j-1)) {
9                    count++;
10                }
11                else {
12                    ans = ans+count+s.charAt(j-1);
13                    count=1;
14                }
15            }
16            ans=ans+count+s.charAt(s.length()-1);
17            s = ans;
18        }
19        return s;
20    }
21}
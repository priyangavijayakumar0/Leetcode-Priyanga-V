// Last updated: 9/6/2026, 8:17:10 AM
1class Solution {
2    public int countRotations(String s, int k) {
3        int n=s.length();
4        int c=0;
5        for(int shift =0;shift<n;shift++){
6            int ep=0;
7            for(int i=0;i<n-1;i++){
8                char a=s.charAt((i+shift)%n);
9                char b=s.charAt((i+shift+1)%n);
10                if(a==b){
11                    ep++;
12                }
13                
14            }
15            if(ep==k){
16                c++;
17            }
18        }
19        return c;
20        
21    }
22}
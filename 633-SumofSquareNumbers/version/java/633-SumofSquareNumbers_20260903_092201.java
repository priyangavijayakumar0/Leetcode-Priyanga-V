// Last updated: 9/3/2026, 9:22:01 AM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        int a=0,b=(int)Math.sqrt(c);
4        while(a<=b){
5            long sum=(long)a*a+(long)b*b;
6            if(sum==c)
7            return true;
8            else if(sum<c)
9            a++;
10            else
11            b--;
12        }
13        return false;
14        
15    }
16}
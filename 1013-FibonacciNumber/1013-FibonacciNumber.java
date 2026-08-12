// Last updated: 8/12/2026, 12:31:02 PM
class Solution {
    public int fib(int n) {
        int i;
        if(n==0)
         return n;
        if(n==1)
          return n;
        
       return fib(n-1)+fib(n-2);
      
          }
}
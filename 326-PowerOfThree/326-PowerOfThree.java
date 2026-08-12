// Last updated: 8/12/2026, 12:33:23 PM
class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<1)
       {
        return false;
       } 
       while(n%3==0)
       {
        n/=3;
       }
       if(n==1)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}
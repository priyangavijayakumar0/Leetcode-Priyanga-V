// Last updated: 8/12/2026, 12:34:27 PM
class Solution {
    public boolean isHappy(int n) {
        int sum;
        while(n!=1&&n!=4)
        {
            sum=0;
            while(n!=0)
            {
            int d=n%10;
            sum=sum+(d*d);
            n/=10;
            }
            n=sum;
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
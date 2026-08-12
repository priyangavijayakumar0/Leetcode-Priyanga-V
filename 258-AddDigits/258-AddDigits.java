// Last updated: 8/12/2026, 12:33:46 PM
class Solution {
    public int addDigits(int num) {
        int n= num;
        while(n>9)
        {
            int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
             n/=10;
        }
        n=sum;
        }
        return n;

    }
}
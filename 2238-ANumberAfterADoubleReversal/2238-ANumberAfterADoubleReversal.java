// Last updated: 8/12/2026, 12:29:35 PM
class Solution {
    public boolean isSameAfterReversals(int num) 
    {  int temp,reversed1=0,reversed2=0;
       temp=num;
        while(num!=0)
        {
         int d=num%10;
         reversed1=reversed1*10+d;
         num/=10;
        }
        while(reversed1!=0)
        {
         int m=reversed1%10;
         reversed2=reversed2*10+m;
         reversed1/=10;
        }
        if(temp==reversed2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }     
}

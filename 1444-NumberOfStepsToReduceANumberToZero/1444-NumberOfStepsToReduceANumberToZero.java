// Last updated: 8/12/2026, 12:30:14 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
    while( num!=0)
    {
      if(num%2==0)
      {
       num/=2;
       c++;
      }
       else if(num%2!=0)
       {
       num-=1;
       c++;
       }

    }
    return c;
    }

}
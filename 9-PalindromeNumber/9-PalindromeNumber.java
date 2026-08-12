// Last updated: 8/12/2026, 12:37:19 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int ans=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int d =x%10;
            ans=ans*10+d;
            x/=10;
        }
        if(ans==temp){
            return true;
        }
        else{
            return false;
        }
    }
}

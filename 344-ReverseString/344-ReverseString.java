// Last updated: 8/12/2026, 12:33:13 PM
class Solution {
    public void reverseString(char[] s) {
        int st=0,e=s.length -1;
        while(st<e)
        {
        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;
        st++;
        e--;
        }
        for(char x:s)
        System.out.print(x+" ");

        
    }
}
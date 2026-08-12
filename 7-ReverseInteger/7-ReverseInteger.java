// Last updated: 8/12/2026, 12:37:23 PM
class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int ans = x % 10;   
            x /= 10;            
            if (r > Integer.MAX_VALUE/10 || (r == Integer.MAX_VALUE/10 && ans > 7)) 
            return 0;
            if (r < Integer.MIN_VALUE/10 || (r == Integer.MIN_VALUE/10 && ans < -8))
            return 0;
            
            r = r * 10 + ans;
        }
        return r;

        
    }
}
// Last updated: 8/12/2026, 12:34:46 PM
class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            res = (res << 1) | bit;
            n >>= 1;
        }

        return res;

        
    }
}
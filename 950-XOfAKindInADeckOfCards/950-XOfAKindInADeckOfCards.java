// Last updated: 8/12/2026, 12:31:11 PM
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : deck)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int gcd = 0;

        for (int count : map.values()) {
            gcd = gcd(gcd, count);
        }

        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
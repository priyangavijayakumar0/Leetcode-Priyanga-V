// Last updated: 8/12/2026, 12:28:50 PM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            int f = freq.getOrDefault(num, 0) + 1;
            freq.put(num, f);
            maxFreq = Math.max(maxFreq, f);
        }

        int result = 0;

        for (int f : freq.values()) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;
    }
}
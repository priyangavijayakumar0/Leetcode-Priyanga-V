// Last updated: 8/12/2026, 12:30:26 PM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(freq.values());

        return set.size() == freq.size();
    }
}
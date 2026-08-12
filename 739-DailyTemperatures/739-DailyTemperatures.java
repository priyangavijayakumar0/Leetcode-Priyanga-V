// Last updated: 8/12/2026, 12:31:49 PM
import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int p = s.pop();
                ans[p] = i - p;
            }
            s.push(i);
        }
        return ans;
    }
}
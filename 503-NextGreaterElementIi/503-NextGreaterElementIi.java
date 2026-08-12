// Last updated: 8/12/2026, 12:32:31 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {

            while (!stack.isEmpty() &&
                    nums[stack.peek()] < nums[i % n]) {

                ans[stack.pop()] = nums[i % n];
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return ans;
        
    }
}
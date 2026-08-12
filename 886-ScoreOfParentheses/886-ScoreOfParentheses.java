// Last updated: 8/12/2026, 12:31:23 PM
class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0);

            } else {
              int value = stack.pop();
                int score = Math.max(2 * value, 1);
                stack.push(stack.pop() + score);
            }
        }

        return stack.pop();

        
    }
}
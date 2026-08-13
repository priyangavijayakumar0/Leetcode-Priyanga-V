// Last updated: 8/13/2026, 7:18:38 AM
1class Solution {
2    public int calPoints(String[] ops) {
3        Stack<Integer> stack = new Stack<>();
4        for (String op : ops) {
5            if (op.equals("C")) stack.pop();
6            else if (op.equals("D")) stack.push(stack.peek() * 2);
7            else if (op.equals("+")) {
8                int a = stack.pop(), b = stack.peek();
9                stack.push(a); stack.push(a + b);
10            } else stack.push(Integer.parseInt(op));
11        }
12        int sum = 0;
13        for (int n : stack) sum += n;
14        return sum;
15    }
16}
17
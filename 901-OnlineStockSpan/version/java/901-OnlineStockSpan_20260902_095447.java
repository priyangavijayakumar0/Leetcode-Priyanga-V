// Last updated: 9/2/2026, 9:54:47 AM
1import java.util.*;
2class StockSpanner {
3    private Stack<int[]> stack;
4    public StockSpanner() {
5        stack = new Stack<>();
6    }
7    public int next(int price) {
8        int span = 1;
9        while (!stack.isEmpty() && stack.peek()[0] <= price) {
10            span += stack.pop()[1];
11        }
12        stack.push(new int[]{price, span});
13        return span;
14    }
15}
16
17/**
18 * Your StockSpanner object will be instantiated and called as such:
19 * StockSpanner obj = new StockSpanner();
20 * int param_1 = obj.next(price);
21 */
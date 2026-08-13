// Last updated: 8/13/2026, 7:17:20 AM
1class MyQueue {
2    private Stack<Integer> in = new Stack<>();
3    private Stack<Integer> out = new Stack<>();
4
5    public void push(int x) {
6        in.push(x);
7    }
8
9    public int pop() {
10        peek(); // ensure out has the front element
11        return out.pop();
12    }
13
14    public int peek() {
15        if (out.isEmpty()) {
16            while (!in.isEmpty()) out.push(in.pop());
17        }
18        return out.peek();
19    }
20
21    public boolean empty() {
22        return in.isEmpty() && out.isEmpty();
23    }
24}
25
// Last updated: 8/13/2026, 7:18:42 AM
1class RecentCounter {
2    Queue<Integer> q = new LinkedList<>();
3    public int ping(int t) {
4        q.add(t);
5        while (q.peek() < t - 3000) q.poll();
6        return q.size();
7    }
8}
9
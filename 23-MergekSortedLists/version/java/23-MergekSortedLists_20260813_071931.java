// Last updated: 8/13/2026, 7:19:31 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
14        for (ListNode node : lists) if (node != null) pq.add(node);
15        ListNode dummy = new ListNode(0), tail = dummy;
16        while (!pq.isEmpty()) {
17            ListNode cur = pq.poll();
18            tail.next = cur; tail = cur;
19            if (cur.next != null) pq.add(cur.next);
20        }
21        return dummy.next;
22    }
23}
24
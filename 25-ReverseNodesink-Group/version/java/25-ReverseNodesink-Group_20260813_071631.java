// Last updated: 8/13/2026, 7:16:31 AM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode pre = dummy, end = dummy;
16
17        while (true) {
18            for (int i = 0; i < k && end != null; i++) end = end.next;
19            if (end == null) break;
20            ListNode start = pre.next, next = end.next;
21            end.next = null;
22            pre.next = reverse(start);
23            start.next = next;
24            pre = start;
25            end = pre;
26        }
27        return dummy.next;
28    }
29
30    private ListNode reverse(ListNode head) {
31        ListNode prev = null, curr = head;
32        while (curr != null) {
33            ListNode next = curr.next;
34            curr.next = prev;
35            prev = curr;
36            curr = next;
37        }
38        return prev;
39    }
40}
41
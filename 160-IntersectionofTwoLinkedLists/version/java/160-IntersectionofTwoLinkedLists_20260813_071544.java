// Last updated: 8/13/2026, 7:15:44 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13public ListNode getIntersectionNode(ListNode a, ListNode b) {
14    ListNode p1 = a, p2 = b;
15    while (p1 != p2) {
16        p1 = (p1 == null) ? b : p1.next;
17        p2 = (p2 == null) ? a : p2.next;
18    }
19    return p1;
20}
21
22}
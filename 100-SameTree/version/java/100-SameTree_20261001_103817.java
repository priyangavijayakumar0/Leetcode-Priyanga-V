// Last updated: 10/1/2026, 10:38:17 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18
19        if (p == null && q == null) {
20            return true;
21        }
22
23        if (p == null || q == null) {
24            return false;
25        }
26
27        if (p.val != q.val) {
28            return false;
29        }
30
31        return isSameTree(p.left, q.left) &&
32               isSameTree(p.right, q.right);
33    }
34}
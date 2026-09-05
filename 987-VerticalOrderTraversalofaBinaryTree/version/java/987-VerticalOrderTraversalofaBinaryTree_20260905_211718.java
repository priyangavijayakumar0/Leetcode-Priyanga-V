// Last updated: 9/5/2026, 9:17:18 PM
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
17    List<int[]> nodes = new ArrayList<>();
18    public List<List<Integer>> verticalTraversal(TreeNode root) {
19        dfs(root, 0, 0);
20        nodes.sort((a,b) -> a[0]==b[0] ? 
21            (a[1]==b[1] ? a[2]-b[2] : a[1]-b[1]) : a[0]-b[0]);
22        List<List<Integer>> res = new ArrayList<>();
23        int prevCol = Integer.MIN_VALUE;
24        for (int[] n : nodes) {
25            if (n[0] != prevCol) {
26                res.add(new ArrayList<>());
27                prevCol = n[0];
28            }
29            res.get(res.size()-1).add(n[2]);
30        }
31        return res;
32    }
33    void dfs(TreeNode node, int row, int col) {
34        if (node == null) return;
35        nodes.add(new int[]{col, row, node.val});
36        dfs(node.left, row+1, col-1);
37        dfs(node.right, row+1, col+1);
38    }
39}
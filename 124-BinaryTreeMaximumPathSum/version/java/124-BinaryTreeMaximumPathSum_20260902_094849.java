// Last updated: 9/2/2026, 9:48:49 AM
1class Solution {
2    private int maxSum;
3    public int maxPathSum(TreeNode root) {
4        maxSum = Integer.MIN_VALUE;
5        dfs(root);
6        return maxSum;
7    }
8    private int dfs(TreeNode node) {
9        if (node == null) return 0;
10        int left = Math.max(0, dfs(node.left));
11        int right = Math.max(0, dfs(node.right));
12        maxSum = Math.max(maxSum, node.val + left + right);
13        return node.val + Math.max(left, right);
14    }
15}
16
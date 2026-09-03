// Last updated: 9/3/2026, 9:11:08 AM
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
17    private int cam=0;
18    public int minCameraCover(TreeNode root) {
19        if(dfs(root)==0){
20            cam++;
21        }
22        return cam;
23    }
24    private int dfs(TreeNode node){
25        if(node == null)
26        return 2;
27        int left=dfs(node.left);
28        int right=dfs(node.right);
29        if(left ==0||right==0){
30            cam++;
31            return 1;
32        }
33        if(left ==1 ||right==1){
34            return 2;
35        }
36        return 0;
37    }
38}
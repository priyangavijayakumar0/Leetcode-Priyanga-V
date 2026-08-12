// Last updated: 8/12/2026, 12:28:21 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    private int dfs (TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int leftmax=dfs(node.left);
        int rightmax=dfs(node.right);
        int maxvalue=Math.max(node.val,Math.max(leftmax,rightmax));
        if(node.val==maxvalue){
            count ++;
        }
        return maxvalue;
    }
}
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
    public boolean isBalanced(TreeNode root) {
        int ans = height(root);

        if(ans==-1){
            return false;
        }
        return true;
    }
    public int height(TreeNode root){
        if(root ==null){
            return 0;
        }
        int left = height(root.left);
        if(left==-1){
            return -1;
        }
        int right = height(root.right);
        if(right==-1){
            return -1;
        }

        int ans =Math.abs(right-left);
        if(ans>1)
        return -1;

        return Math.max(right, left)+1;
    }
}
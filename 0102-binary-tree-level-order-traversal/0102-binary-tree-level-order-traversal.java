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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currans= new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper= new ArrayDeque<>();

        main.add(root);
        while(main.size()>0){
            TreeNode curNode = main.remove();

            currans.add(curNode.val);


            if(curNode.left!= null){
                helper.add(curNode.left);
            }
            if(curNode.right !=null){
                helper.add(curNode.right);
            }

            if(main.size()==0){
                ans.add(currans);
                currans = new ArrayList<>();
                main= helper;
                helper = new ArrayDeque<>();

            }
        }
        return ans;
    }
}
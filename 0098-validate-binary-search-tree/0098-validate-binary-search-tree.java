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
    TreeNode safe=null;
    boolean flag=true;
    void inOrder(TreeNode root){
        if(root==null){ return;}
        inOrder(root.left);
        if(safe!=null){
            if(safe.val>=root.val){
                flag=false;
                return;
            }
        }
        safe=root;
        inOrder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return flag;
    }
}
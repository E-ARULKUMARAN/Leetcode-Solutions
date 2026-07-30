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
    int best=0;
    int check(TreeNode root){
        if(root==null){return 0;}
        int l=check(root.left);
        int r=check(root.right);
        best=Math.max(best,r+l);
        return (1+Math.max(l,r));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return best;
    }
}
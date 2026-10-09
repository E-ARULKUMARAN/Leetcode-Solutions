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
    int Leftheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Leftheight(root.left);
    }
    int Rightheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Rightheight(root.right);    }
    public int countNodes(TreeNode root) {
        if(root==null){return 0;}
        int left=Leftheight(root);
        int right=Rightheight(root);
        if(left==right){return (1<<left)-1;}
        return 1 + countNodes(root.left)+ countNodes(root.right);
    }
}
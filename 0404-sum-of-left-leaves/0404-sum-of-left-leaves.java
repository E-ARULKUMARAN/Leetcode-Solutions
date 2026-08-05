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
    int res=0;
    TreeNode safe=null;
    public int inOrder(TreeNode root){
        if(root==null)
        {
            return 0;
        }
        int l=inOrder(root.left);
        int r=inOrder(root.right);
        if(l==1)
        {
            res+=root.left.val;
            
        }
        return l+r+1;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        inOrder(root);
        return res;
    }
}
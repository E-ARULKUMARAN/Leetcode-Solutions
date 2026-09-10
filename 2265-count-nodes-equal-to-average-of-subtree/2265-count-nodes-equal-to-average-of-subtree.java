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
    int[] solve(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] l=solve(root.left);
        int[] r=solve(root.right);
        int nodeCount=l[0]+r[0]+1;
        int sum=l[1]+r[1]+root.val;
        if(root.val==(sum/nodeCount)){
            count++;
        }
        return new int[]{nodeCount,sum};
    }
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }
}
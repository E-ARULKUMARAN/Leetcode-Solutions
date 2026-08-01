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
    TreeNode root=null;
    TreeNode create(TreeNode safe,int[] arr,int l,int h){
        if(l>h){return null;}
        int mid=l+((h-l)>>1);
        TreeNode n=new TreeNode(arr[mid]);
        if(root==null){
            root=n;
        }
        n.left=create(n,arr,l,mid-1);
        n.right=create(n,arr,mid+1,h);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        create(null,nums,0,nums.length-1);
        return root;
    }
}
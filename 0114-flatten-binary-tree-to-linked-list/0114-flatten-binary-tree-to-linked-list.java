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
    List<TreeNode> res=new ArrayList<>();
    void preOrder(TreeNode root){
        if(root!=null){
            res.add(root);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void flatten(TreeNode root) {
        if(root==null){return;}
        res.clear();
        preOrder(root);
        for(int i=0;i<res.size()-1;i++){
            res.get(i).left=null;
            res.get(i).right=res.get(i+1);
        }
        res.get(res.size()-1).left=null;
        res.get(res.size()-1).right=null;
    }
}
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
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        int x=root.val;
        while(!(q.isEmpty())){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if(x!=t.val){
                    return false;
                }
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
        }
        return true;
    }
}
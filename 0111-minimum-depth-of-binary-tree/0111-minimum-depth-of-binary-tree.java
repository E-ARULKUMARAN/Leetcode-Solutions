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
    public int minDepth(TreeNode root) {
        if(root==null){return 0;}
        Queue<TreeNode> q=new ArrayDeque<>();
        int depth=1;
        q.offer(root);
        while(!(q.isEmpty())){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if(t.left==null && t.right==null){
                    return depth;
                }
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
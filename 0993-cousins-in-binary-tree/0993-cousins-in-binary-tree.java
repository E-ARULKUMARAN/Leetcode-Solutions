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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!(q.isEmpty())){
            int n=q.size();
            int c=0;
            for(int i=0;i<n;i++)
            {
                TreeNode t=q.poll();
                if(t.left!=null)
                {
                    q.offer(t.left);
                }
                if(t.right!=null)
                {
                    q.offer(t.right);
                }
                if(t.left!=null && (t.left.val==x || t.left.val==y) || t.right!=null && (t.right.val==x || t.right.val==y)){
                    c++;
                } 
            }
            if(c==2)
            {
                return true;
            }
        }
        return false;
    }
}
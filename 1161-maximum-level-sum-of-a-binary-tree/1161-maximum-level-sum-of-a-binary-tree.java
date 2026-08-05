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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        int depth=1,res=1,max=Integer.MIN_VALUE;
        while(!(q.isEmpty())){
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                sum+=t.val;
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
            if(max<sum){
                max=sum;
                res=depth;
            }
            depth++;
        }
        return res;
    }
}
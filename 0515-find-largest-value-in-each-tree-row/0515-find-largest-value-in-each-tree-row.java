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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){return new ArrayList<>();}
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!(q.isEmpty())){
            int n=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if(max<t.val){
                    max=t.val;
                }
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
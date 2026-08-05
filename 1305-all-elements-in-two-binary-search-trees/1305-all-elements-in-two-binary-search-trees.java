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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q1=new ArrayDeque<>();
        Queue<TreeNode> q2=new ArrayDeque<>();
        if(root1!=null){
            q1.offer(root1);
        }
        if(root2!=null){
            q2.offer(root2);
        }
        List<Integer> res=new ArrayList<>();
        while(!(q1.isEmpty())){
            int n=q1.size();
            for(int i=0;i<n;i++){
                TreeNode t=q1.poll();
                res.add(t.val);
                if(t.left!=null){
                    q1.offer(t.left);
                }
                if(t.right!=null){
                    q1.offer(t.right);
                }
            }
        }
        while(!(q2.isEmpty())){
            int n=q2.size();
            for(int i=0;i<n;i++){
                TreeNode t=q2.poll();
                res.add(t.val);
                if(t.left!=null){
                    q2.offer(t.left);
                }
                if(t.right!=null){
                    q2.offer(t.right);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){return new ArrayList<>();}
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        Queue<TreeNode> r=new ArrayDeque<>();
        int depth=1;
        q.offer(root);
        r.offer(root);
        res.add(new ArrayList<>(List.of(root.val)));
        while(!(q.isEmpty())){
            int n=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode t1=q.poll();
                TreeNode t2=r.poll();
                if(t1.left!=null){
                    q.offer(t1.left);
                }
                if(t1.right!=null){
                    q.offer(t1.right);
                }
                if(t2.right!=null){
                    r.offer(t2.right);
                }
                if(t2.left!=null){
                    r.offer(t2.left);
                }
                if((depth % 2)==1){
                    if(t2.right!=null){
                        l.add(t2.right.val);
                    }
                    if(t2.left!=null){
                        l.add(t2.left.val);
                    }
                }
                else{
                    if(t1.left!=null){
                        l.add(t1.left.val);
                    }
                    if(t1.right!=null){
                        l.add(t1.right.val);
                    }
                }
            }
            if(!(l.isEmpty()))
            res.add(l);
            depth++;
        }
        return res;
    }
}
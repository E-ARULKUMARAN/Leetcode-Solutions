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
    boolean flag=false;
    void inOrder(TreeNode root,HashSet<Integer> st,int target){
        if(root!=null){
            if(st.contains(target-root.val)){
                flag=true;
            }
            st.add(root.val);
            inOrder(root.left,st,target);
            inOrder(root.right,st,target);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        inOrder(root,new HashSet<>(),k);
        return flag;
    }
}
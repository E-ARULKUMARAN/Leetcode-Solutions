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
    List<Integer> l = new ArrayList<>();
    boolean flag = false;
    int sum = 0;

    void check(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        sum += root.val;
        check(root.left, target);
        if ((root.left == null && root.right == null) && sum == target) {
            flag = true;
            return;
        }
        check(root.right, target);
        sum -= l.get(l.size() - 1);
        l.remove(l.size() - 1);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root, targetSum);
        return flag;
    }
}
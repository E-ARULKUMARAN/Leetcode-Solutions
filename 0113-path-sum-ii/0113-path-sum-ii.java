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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    int sum = 0;

    void check(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        sum += root.val;
        if (root.left == null && root.right == null && sum == target) {
            List<Integer> n = new ArrayList<>(l);
            res.add(n);
        }
        check(root.left, target);
        check(root.right, target);
        sum -= l.get(l.size() - 1);
        l.remove(l.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        check(root, targetSum);
        return res;
    }
}
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

    int sum(List<Integer> l) {
        int sum = 0;
        for (int x : l) {
            sum += x;
        }
        return sum;
    }

    boolean flag = false;

    void check(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        check(root.left, target);
        if ((root.left == null && root.right == null) && sum(l) == target) {
            flag = true;
            return;
        }
        check(root.right, target);
        l.remove(l.size() - 1);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root, targetSum);
        return flag;
    }
}
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
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int sum = 0;
        while (!(q.isEmpty())) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                if ((t.val & 1) == 0) {
                    if (t.left != null && t.left.left != null) {
                        sum += t.left.left.val;
                    }
                    if (t.left != null && t.left.right != null) {
                        sum += t.left.right.val;
                    }
                    if (t.right != null && t.right.left != null) {
                        sum += t.right.left.val;
                    }
                    if (t.right != null && t.right.right != null) {
                        sum += t.right.right.val;
                    }
                }
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
        }
        return sum;
    }
}
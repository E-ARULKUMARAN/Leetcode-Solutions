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
    int selectionSort(int[] arr, int n) {
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[max] > arr[j]) {
                    max = j;
                }
            }
            if (max != i) {
                int t = arr[i];
                arr[i] = arr[max];
                arr[max] = t;
                c++;
            }
        }
        return c;
    }

    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int c = 0;
        while (!(q.isEmpty())) {
            int n = q.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                arr[i] = t.val;
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            c += selectionSort(arr, n);
        }
        return c;
    }
}
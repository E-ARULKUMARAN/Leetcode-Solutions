class Solution {
    int[] nearestGreaterElementFromLeft(int[] h) {
        int n = h.length;
        int[] res = new int[n];
        res[0] = h[0];
        for (int i = 1; i < n; i++) {
            res[i] = Math.max(res[i - 1], h[i]);
        }
        return res;
    }

    int[] nearestGreaterElementFromRight(int[] h) {
        int n = h.length;
        int[] res = new int[n];
        res[n - 1] = h[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            res[i] = Math.max(res[i + 1], h[i]);
        }
        return res;
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] l = nearestGreaterElementFromLeft(height);
        int[] r = nearestGreaterElementFromRight(height);
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(l[i], r[i]) - height[i];
        }
        return total;
    }
}
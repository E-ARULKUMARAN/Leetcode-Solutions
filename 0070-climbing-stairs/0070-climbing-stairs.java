class Solution {
    int[] dp = new int[46];

    Solution() {
        Arrays.fill(dp, -1);
    }

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        if (dp[n] == -1) {
            dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return dp[n];
    }
}
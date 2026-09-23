class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int tot = Arrays.stream(nums).sum();
        int tar = tot - x;
        if (tar == 0)
            return n;
        if (tar < 0)
            return -1;
        int res = -1;
        int l = 0, sum = 0;
        for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (l <= r && sum > tar) {
                sum -= nums[l];
                l++;
            }
            if (sum == tar) {
                res = Math.max(res, (r - l + 1));
            }
        }
        return res == -1 ? -1 : n - res;
    }
}
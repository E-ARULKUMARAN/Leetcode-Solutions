class Solution {
    void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length, c = 0;
        if (nums[n - 1] != n) {
            for (int i = 0; i < n - 1; i++) {
                if ((nums[i]==1 || nums[i]==n) &&  nums[i] > nums[i + 1]) {
                    swap(i, i + 1, nums);
                    c++;
                }
            }
        }
        if (nums[0] != 1) {
            for (int i = n - 1; i > 0; i--) {
                if ((nums[i]==1 || nums[i]==n) && nums[i] < nums[i - 1]) {
                    swap(i, i - 1, nums);
                    c++;
                }
            }
        }
        return c;
    }
}
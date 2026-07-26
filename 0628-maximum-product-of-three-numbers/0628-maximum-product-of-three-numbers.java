class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=nums[0]*nums[1]*nums[n-1];
        return nums[n-1]*nums[n-2]*nums[n-3]<res?res:nums[n-1]*nums[n-2]*nums[n-3];
    }
}
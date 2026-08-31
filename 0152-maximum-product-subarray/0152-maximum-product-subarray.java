class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int mx=nums[0];
        int mi=nums[0];
        int best=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=mx;
                mx=mi;
                mi=temp;
            }
            mx=Math.max(nums[i],mx*nums[i]);
            mi=Math.min(nums[i],mi*nums[i]);

            best=Math.max(best,mx);
        }
        return best;
    }
}
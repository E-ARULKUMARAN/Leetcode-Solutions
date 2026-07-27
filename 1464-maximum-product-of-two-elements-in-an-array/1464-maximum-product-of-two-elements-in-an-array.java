class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,max1=0,max2=0;
        for(int i=0;i<n;i++){
            if(max1<=nums[i]){
                if(max2<=max1){
                    max2=max1;
                }
                max1=nums[i];
            }
            else if(max2<=max1 && max2<=nums[i]){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
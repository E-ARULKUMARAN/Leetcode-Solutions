class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
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
            if(min1>=nums[i]){
                if(min2>=min2){
                    min2=min1;
                }
                min1=nums[i];
            }
            else if(min2>=min1 && min2>=nums[i]){
                min2=nums[i];
            }
        }
        return (max1*max2)-(min1*min2);
    }
}
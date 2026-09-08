class Solution {
    void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    void reverse(int[] nums,int i,int j){
        while(i<=j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                swap(i,ind,nums);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=1,h=n-2;
        if(n==1 || nums[0]!=nums[1]){
            return nums[0]; 
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(nums[mid-1]==nums[mid]){
                if((mid-1)%2==0){
                    l=mid+1;
                }
                else{
                    h=mid-2;
                }
            }
            else if(nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    l=mid+2;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=1,h=n-2;
        if(n==1 || nums[0]>nums[1])
        return 0;
        if(nums[n-2]<nums[n-1])
        return n-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return -1;
    }
}
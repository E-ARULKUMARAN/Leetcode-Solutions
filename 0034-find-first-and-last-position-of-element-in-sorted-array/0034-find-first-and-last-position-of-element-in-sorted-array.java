class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int [] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(nums[mid]==target){
                res[0]=mid;
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        l=0;
        h=n-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(nums[mid]==target){
                res[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}
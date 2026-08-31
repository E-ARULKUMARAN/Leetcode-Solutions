class Solution {
    boolean check(int[] nums,int k,int m){
        int c=1,sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(sum>m){
                sum=nums[i];
                c++;
            }
        }
        return c<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt(),h=Arrays.stream(nums).sum(),ans=0;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(check(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
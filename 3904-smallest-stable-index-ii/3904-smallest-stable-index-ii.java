class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        if(n==1){
            return 0<=k?0:-1;
        }
        long[] prefix=new long[n];
        long[] suffix=new long[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n-1;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
            suffix[n-i-1]=Math.min(suffix[n-i],nums[n-i-1]);
        }
        prefix[n-1]=Math.max(prefix[n-2],nums[n-1]);
        suffix[0]=Math.min(suffix[1],nums[0]);
        for(int i=0;i<n;i++){
            if(prefix[i]-suffix[i]<=k){
                return i;
            }
        }
        return -1;
    }
}
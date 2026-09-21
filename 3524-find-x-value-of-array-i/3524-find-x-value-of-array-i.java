class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result=new long[k];
        long[] dp=new long[k];
        for(int i=0;i<nums.length;i++){
            int rem=nums[i]%k;
            long[] next=new long[k];
            next[rem]++;
            for(int j=0;j<k;j++){
                next[(j*rem)%k]+=dp[j];
            }
            dp=next;
            for(int j=0;j<k;j++){
                result[j]+=dp[j];
            }
        }
        return result;
    }
}
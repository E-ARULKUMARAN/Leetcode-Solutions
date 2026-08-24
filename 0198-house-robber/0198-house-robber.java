class Solution {
    int Rob(int[] arr,int i,int[] dp){
        if(i<=0){return 0;}
        if(dp[i]==-1){
            int np=Rob(arr,i-1,dp);
            int p=arr[i-1]+Rob(arr,i-2,dp);
            dp[i]=Math.max(np,p);
        }
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Rob(nums,n,dp);
    }
}
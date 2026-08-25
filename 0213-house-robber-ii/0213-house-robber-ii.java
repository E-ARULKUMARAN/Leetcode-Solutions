class Solution {
    int Rob(int[] arr,int l,int r,int[] dp){
        if(r<=l){return 0;}
        if(dp[r]==-1){
            int np=Rob(arr,l,r-1,dp);
            int p=arr[r-1]+Rob(arr,l,r-2,dp);
            dp[r]=Math.max(np,p);
        }
        return dp[r];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int firstRob=Rob(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int secondRob=Rob(nums,1,n,dp);
        return Math.max(firstRob,secondRob);
    }
}
class Solution {
    int tribo(int n,int[] dp){
        if(n==0){return 0;}
        if(n<=2){return 1;}
        if(dp[n]==-1){
            dp[n]=tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
        }
        return dp[n];
    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return tribo(n,dp);
    }
}
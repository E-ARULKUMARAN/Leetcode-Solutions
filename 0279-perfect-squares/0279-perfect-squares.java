class Solution {
    int perfectSquare(int n,int [] dp){
        if(n<=3){return n;}
        if(dp[n]==-1){
            int v=Integer.MAX_VALUE;
            for(int i=1;i*i<=n;i++){
                v=Math.min(v,perfectSquare(n-i*i,dp));
            }
            dp[n]=1+v;
        }
        return dp[n];
    }
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return perfectSquare(n,dp);
    }
}
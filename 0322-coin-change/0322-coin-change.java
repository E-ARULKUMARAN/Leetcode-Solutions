class Solution {
    int mincost(int[] coins,int amount,int[] dp){
        if(amount<0){return Integer.MAX_VALUE;}
        if(amount==0){return 0;}
        if(dp[amount]==-1){
            int v=Integer.MAX_VALUE;
            for(int k=0;k<coins.length;k++){
                v=Math.min(v,mincost(coins,amount-coins[k],dp));
            }
            if(v==Integer.MAX_VALUE){
                dp[amount]=Integer.MAX_VALUE;
            }
            else{
                dp[amount]=1+v;
            }
        }
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int res=mincost(coins,amount,dp);
        return res==Integer.MAX_VALUE?-1:res;
    }
}
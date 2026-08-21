class Solution {
    int cost(int i,int j,int[][] dp,int[][] grid){
        if(i<0 || j<0){return Integer.MAX_VALUE;}
        if(j==0 && i==0){return grid[0][0];}
        if(dp[i][j]==-1){
            dp[i][j]=grid[i][j]+Math.min(cost(i-1,j,dp,grid),cost(i,j-1,dp,grid));
        }
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return cost(n-1,m-1,dp,grid);
    }
}
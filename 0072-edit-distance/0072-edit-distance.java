class Solution {
    int edit(String s1,String s2,int i,int j,int[][] dp){
        if(i==0){return j;}
        if(j==0){return i;}
        if(dp[i][j]==-1){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=edit(s1,s2,i-1,j-1,dp);
            }
            else{
                dp[i][j]=1+Math.min(edit(s1,s2,i-1,j,dp),Math.min(edit(s1,s2,i,j-1,dp),edit(s1,s2,i-1,j-1,dp)));
            }
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return edit(word1,word2,n,m,dp);
    }
}
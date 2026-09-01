class Solution {
    boolean check(int i,int j,String s,String p,Boolean[][] dp){
        if(j==p.length()){return i==s.length();}
        if(dp[i][j]==null){
        boolean first=(i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'));
        if(j+1<p.length() && p.charAt(j+1)=='*'){
            dp[i][j]=(check(i,j+2,s,p,dp) || (first && check(i+1,j,s,p,dp)));
        }
        else{
            dp[i][j]=first && check(i+1,j+1,s,p,dp);
        }
        }
        return dp[i][j];
    }
    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        Boolean[][] dp=new Boolean[n+1][m+1];
        return check(0,0,s,p,dp);
    }
}
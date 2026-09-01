class Solution {
    public int trailingZeroes(int n) {
        int i=5,j=5,ans=0;
        while(n>=i){
            ans+=n/i;
            i=i*j;
        }
        return ans;
    }
}
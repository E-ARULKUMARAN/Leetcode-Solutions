class Solution {
    public boolean hasAlternatingBits(int n) {
        int check=n&1;
        n>>=1;
        while(n>0){
            if(check==(n&1)){
                return false;
            }
            check=n&1;
            n>>=1;
        }
        return true; 
    }
}
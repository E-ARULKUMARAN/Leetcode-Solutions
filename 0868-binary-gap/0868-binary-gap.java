class Solution {
    public int binaryGap(int n) {
        int c=0,res=0;
        while(n>0){
            if((n & 1)==1){
                res=Math.max(res,c);
                c=1;
            }
            else{
                if(c!=0){
                    c++;
                }
            }
            n>>=1;
        }
        return res;
    }
}
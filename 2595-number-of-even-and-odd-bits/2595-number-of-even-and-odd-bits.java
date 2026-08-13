class Solution {
    public int[] evenOddBit(int n) {
        int [] res=new int[2];
        Arrays.fill(res,0);
        int i=0;
        while(n>0){
            if((n&1)==1){
                if((i&1)==1){
                    res[1]++;
                }
                else{
                    res[0]++;
                }
            }
            i++;
            n>>=1;

        }
        return res;
    }
}
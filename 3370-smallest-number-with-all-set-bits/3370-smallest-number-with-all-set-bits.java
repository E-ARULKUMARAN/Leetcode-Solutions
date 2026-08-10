class Solution {
    public int smallestNumber(int n) {
        int dummy=1,t=n;
        while(t>0){
            dummy<<=1;
            t>>=1;
        }
        dummy--;
        return dummy | n;
    }
}
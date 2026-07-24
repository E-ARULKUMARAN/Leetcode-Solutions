class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1,h=(long)num/2;
        if(num==1){
            return true;
        }
        while(l<=h){
            long x=l+((h-l)>>1);
            long prod=x*x;
            if(prod==num){
                return true;
            }
            else if(prod<num){
                l=x+1;
            }
            else{
                h=x-1;
            }
        }
        return false;
    }
}
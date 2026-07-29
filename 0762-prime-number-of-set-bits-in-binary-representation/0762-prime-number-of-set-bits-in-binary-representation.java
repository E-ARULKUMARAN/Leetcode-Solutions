class Solution {
    boolean check(int n){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        if(c<2)
        return false;
        for(int i=2;i<c;i++){
            if(c%i==0)
            return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(check(i)){
                count++;
            }
        }
        return count;
    }
}
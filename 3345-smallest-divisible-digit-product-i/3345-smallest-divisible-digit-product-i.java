class Solution {
    boolean check(int n,int t){
        int prod=1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        return prod%t==0;
    }
    public int smallestNumber(int n, int t) {
        int i=n;
        while(true){
            if(check(i,t))
            return i;
            i++;
        }
    }
}
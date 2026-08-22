class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1,temp=n;
        while(temp>0){
            prod*=temp%10;
            sum+=temp%10;
            temp/=10;
        }
        int res=sum+prod;
        return n%res==0;
    }
}
class Solution {
    public int findComplement(int num) {
        int n=num,count=0;
        while(n>0){
            count++;
            n>>=1;
        }
        if(count==31){
            count=30;
            return (((1<<count)-1)|(1<<30))^(num);
        }
        return ((1<<count)-1)^(num);
    }
}
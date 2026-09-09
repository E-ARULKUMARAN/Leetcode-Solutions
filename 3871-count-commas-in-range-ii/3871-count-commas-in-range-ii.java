class Solution {
    public long countCommas(long n) {
        long c=0L,num=1_000_000_000_000_000L,i=4;
        if(num==n){
            n--;
            c+=5;
        }
        while(n>999){
            if((num>n) && (n>=(num/1000))){
                c=c+((n-(num/1000-1))*i);
                if(num==n){
                    c++;
                }
                n=(num/1000)-1;
            }
            num=num/1000;
            i--;
        }
        return c;
    }
}
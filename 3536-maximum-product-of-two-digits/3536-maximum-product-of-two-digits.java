class Solution {
    public int maxProduct(int n) {
        int first=0,second=0,temp;
        while(n>0){
            temp=n%10;
            if(first<=temp){
                if(second<=first){
                    second=first;
                }
                first=temp;
            }
            else if(second<= first && second<=temp){
                second=temp;
            }
            n/=10;
        }
        return first*second;
    }
}
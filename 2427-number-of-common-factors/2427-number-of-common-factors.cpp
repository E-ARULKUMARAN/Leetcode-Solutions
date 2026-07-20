class Solution {
public:
    int commonFactors(int a, int b) {
        int small=a>b?b:a,c=0;
        for(int i=1;i<=small;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
};
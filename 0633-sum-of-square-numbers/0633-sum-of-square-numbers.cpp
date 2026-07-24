class Solution {
public:
    int squareRoot(int n){
        long long l=0,h=n/2,ans=1;
        while(l<=h){
            long long mid=l+((h-l)>>1);
            if(mid*mid==n){
                return (int)mid;
            }
            else if(mid*mid<n){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    bool judgeSquareSum(int c) {
        if(c==0 || c==1){
            return true;
        }
        long long l=0,h=squareRoot(c);
        long long squareSum;
        while(l<=h){
            squareSum=(l*l + h*h);
            if(squareSum==c)
            return true;
            else if(squareSum>c){
                h--;
            }
            else
            l++;
        }
        return false;
    }
};
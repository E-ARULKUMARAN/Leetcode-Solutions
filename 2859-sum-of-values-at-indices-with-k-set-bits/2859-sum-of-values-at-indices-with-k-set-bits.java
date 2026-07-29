class Solution {
    boolean check(int n,int k){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size(),res=0;
        for(int i=0;i<n;i++){
            if(check(i,k)){
                res+=nums.get(i);
            }
        }
        return res;
    }
}
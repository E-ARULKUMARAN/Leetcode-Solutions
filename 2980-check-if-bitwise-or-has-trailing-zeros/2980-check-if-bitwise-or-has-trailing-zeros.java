class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if((nums[i]&1)==0){
                c++;
                if(c==2){
                    return true;
                }
            }
        }
        return false;
    }
}
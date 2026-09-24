class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            char[] s = String.valueOf(nums[i]).toCharArray();
            if(s.length==3){
                sum=(s[0]-'0')+(s[1]-'0')+(s[2]-'0');
            }
            else if(s.length==2){
                sum=(s[0]-'0')+(s[1]-'0');
            }
            else{
                sum=(s[0]-'0');
            }
            if(i==sum){
                return i;
            }
        }
        return -1;
    }
}
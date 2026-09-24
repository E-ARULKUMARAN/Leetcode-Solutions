class Solution {
    int sum(int x){
        int res=0;
        while(x>0){
            res=res+ x%10;
            x/=10;
        }
        System.out.println(res);
        return res;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i==sum(nums[i])){
                return i;
            }
        }
        return -1;
    }
}
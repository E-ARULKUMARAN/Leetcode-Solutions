class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int m=Arrays.stream(nums).max().getAsInt();
        int[] freq=new int[m+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<=m;i++){
            if(freq[i]>1){
                return i;
            }
        }
        return 0;
    }
}
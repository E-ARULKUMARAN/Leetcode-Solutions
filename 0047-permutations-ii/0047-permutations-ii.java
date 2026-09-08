class Solution {
    void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    void precompute(int index,int[] nums,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            if(!ans.contains(ds)){
                ans.add(ds);
            }
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            precompute(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        precompute(0,nums,ans);
        return ans;
    }
}
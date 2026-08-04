class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int start=nums[0];
        int end=nums[nums.length-1];
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=start+1;i<end;i++){
            if(!(s.contains(i)))ans.add(i);
        }
        return ans;
    }
}
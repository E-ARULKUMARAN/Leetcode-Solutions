class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=nums.length,prefix=0;
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            prefix=prefix%5;
            prefix=((prefix<<1) | nums[i])%5;
            if(prefix % 5==0){
                res.add(true);
                System.out.println(prefix + " " + " true");
            }
            else{
                res.add(false);
                System.out.println(prefix + " " + " false");
            }
        }
        return res;
    }
}
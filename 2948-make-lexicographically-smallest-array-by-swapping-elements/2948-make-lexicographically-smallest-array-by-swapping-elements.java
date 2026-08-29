class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new int[]{nums[i],i});
        }
        Collections.sort(l,(a,b)-> Integer.compare(a[0],b[0]));
        List<Integer> index=new ArrayList<>();
        List<Integer> value=new ArrayList<>();
        index.add(l.get(0)[1]);
        value.add(l.get(0)[0]);
        for(int i=1;i<n;i++){
            if(Math.abs(l.get(i)[0]-l.get(i-1)[0])<=limit){
                index.add(l.get(i)[1]);
                value.add(l.get(i)[0]);
            }
            else{
                Collections.sort(index);
                for(int j=0;j<index.size();j++){
                    nums[index.get(j)]=value.get(j);
                }
                index.clear();
                value.clear();
                index.add(l.get(i)[1]);
                value.add(l.get(i)[0]);
            }
        }
        if(!index.isEmpty()){
            Collections.sort(index);
                for(int j=0;j<index.size();j++){
                    nums[index.get(j)]=value.get(j);
                }
        }
        return nums;
    }
}
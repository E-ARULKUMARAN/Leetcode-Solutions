class Solution {
    public List<Integer> grayCode(int n) {
        int m=1<<n;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            res.add(i ^ (i>>1));
        }
        return res;
    }
}
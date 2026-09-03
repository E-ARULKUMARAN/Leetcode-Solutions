class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=Integer.MAX_VALUE,odd=Integer.MAX_VALUE,n=nums1.length;
        for(int i=0;i<n;i++){
            if((nums1[i] & 1 )==1 ){
                odd=Math.min(odd,nums1[i]);
            }
            else{
                even=Math.min(even,nums1[i]);
            }
        }
        return even==Integer.MAX_VALUE || odd==Integer.MAX_VALUE ?true:odd<even;
    }
}
class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int l=0,pref=0,min1=Integer.MAX_VALUE,res=Integer.MAX_VALUE;
        int[] min=new int[n];
        for(int r=0;r<n;r++){
            pref+=arr[r];
            while(pref>target){
                pref-=arr[l];
                l++;
                if(l==n){
                    break;
                }
            }
            if(pref==target){
                int len=r-l+1;
                if(l>0 && min[l-1]!=Integer.MAX_VALUE){
                    res=Math.min(res,len+min[l-1]);
                }
                min1=Math.min(min1,len); 
            }
            min[r]=min1;
        }
        return res!=Integer.MAX_VALUE?res:-1;  
    }
}
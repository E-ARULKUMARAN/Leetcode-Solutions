class Solution {
     public int Search(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer> st=new Stack<>();
        int[] great=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i])
            st.pop();
            if(!st.isEmpty())
            great[i]=st.peek();
            else
            great[i]=-1;
            st.push(nums2[i]);
        }
        int m=nums1.length;
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            res[i]=great[Search(nums2,nums1[i])];
        }
        return res;
    }
}
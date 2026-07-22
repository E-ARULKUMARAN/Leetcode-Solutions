class Solution {
    int[] nearestSmallIndexFromLeft(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty())
            res[i]=st.peek();
            else
            res[i]=-1;
            st.push(i);
        }
        return res;
    }
    int[] nearestSmallIndexFromRight(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty())
            res[i]=st.peek();
            else
            res[i]=n;
            st.push(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int[] l=nearestSmallIndexFromLeft(heights);
        int[] r=nearestSmallIndexFromRight(heights);
        int n=heights.length,res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            res=Math.max(res,heights[i]*(r[i]-l[i]-1));
        }
        return res;
    }
}
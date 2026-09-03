class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        if(matrix[0][0]>target || matrix[n-1][m-1]<target){
            return false;
        }
        int l=0,h=n-1,ans=-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]<target){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        l=0;
        h=m-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(matrix[ans][mid]==target){
                return true;
            }
            else if(matrix[ans][mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}
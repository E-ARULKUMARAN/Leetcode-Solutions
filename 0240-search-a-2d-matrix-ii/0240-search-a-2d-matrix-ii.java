class Solution {
    boolean check(int[][] M,int row,int target){
        int n=M[row].length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(M[row][mid]==target){
                return true;
            }
            else if(M[row][mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        if(matrix[0][0]>target){
            return false;
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==target){
                return true;
            }
            else if(matrix[i][0]<target){
                if(check(matrix,i,target)==true){
                    return true;
                }
            }
            else if(matrix[i][0]>target){
                return false;
            }
        }
        return false;
    }
}
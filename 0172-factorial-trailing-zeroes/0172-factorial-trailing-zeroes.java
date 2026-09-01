class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<10;j++){
                if(i%Math.pow(5,j)==0){
                    count++;
                }
            }
        }
        return count;
    }
}
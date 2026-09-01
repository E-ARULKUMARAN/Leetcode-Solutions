class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        for(int i=n;i>=1;i--){
            if(i%5==0){
                count++;
            }
            if(i%25==0){
                count++;
            }
            if(i%125==0){
                count++;
            }
            if(i%625==0){
                count++;
            }
            if(i%3125==0){
                count++;
            }
        }
        return count;
    }
}
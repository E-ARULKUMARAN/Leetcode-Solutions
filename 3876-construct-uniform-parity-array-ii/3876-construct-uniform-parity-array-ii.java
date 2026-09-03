class Solution {

    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int even = 0, odd = 0;
        int minOdd=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                even++;
            } else {
                if(minOdd>nums1[i]){
                    minOdd=nums1[i];
                }
                odd++;
            }
        }
        if (odd == 0 || even == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                int x=nums1[i]-minOdd;
                if(x>=1 && x%2==1){
                    continue;
                }
                if(x<=0){
                    return false;
                }
            } 
        }
        return true;
    }
}
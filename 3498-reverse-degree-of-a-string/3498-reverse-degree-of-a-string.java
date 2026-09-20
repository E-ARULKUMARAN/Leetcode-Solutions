class Solution {
    public int reverseDegree(String s) {
        int n=s.length(),k=1,res=0;
        for(int i=0;i<n;i++){
            res+=((s.charAt(i)-('z'+1))*-1)*k;
            k++;
        }
        return res;
    }
}
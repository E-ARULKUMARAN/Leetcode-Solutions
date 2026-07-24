class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=1,h=n-2;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid-1]>arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
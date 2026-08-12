class Solution {
    void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> l=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                l.add(arr[left++]);
            }
            else{
                l.add(arr[right++]);
            }
        }
        while(left<=mid){
            l.add(arr[left++]);
        }
        while(right<=high){
            l.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=l.get(i-low);
        }
    }
    
    void mergeSort(int[] arr,int low,int high){
        if(low<high){
        int mid=low+((high-low)>>1);
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}
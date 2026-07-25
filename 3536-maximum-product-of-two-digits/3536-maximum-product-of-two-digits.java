class Solution {
    public int maxProduct(int n) {
        List<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        list.sort(Comparator.naturalOrder());
        int N=list.size();
        return list.get(N-1)*list.get(N-2);
    }
}
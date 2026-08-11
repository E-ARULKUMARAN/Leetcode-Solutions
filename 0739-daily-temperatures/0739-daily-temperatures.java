class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        Stack<Integer> s=new Stack<>();
        int [] res=new int[n];
        Arrays.fill(res,0);
        for(int i=n-1;i>=0;i--){
            while(!(s.isEmpty()) && t[s.peek()]<=t[i]){
                s.pop();
            }
            if(!(s.isEmpty())){
                res[i]=s.peek()-i;
            }
            s.push(i);
        }
        return res;
    }
}
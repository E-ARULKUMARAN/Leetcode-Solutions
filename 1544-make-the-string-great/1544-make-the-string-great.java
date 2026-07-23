class Solution {
    public String makeGood(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;i++){
            int flag=1;
            while(!st.isEmpty() && i<n && i>=0 && ((int)sb.charAt(st.peek())==(int)sb.charAt(i)-32 || (int)sb.charAt(st.peek())==(int)sb.charAt(i)+32)){
                sb.delete(st.peek(),i+1);
                n-=2;
                i--;
                st.pop();
                flag=0;
            }
            if(flag==0){
                i--;
                continue;
            }
            st.push(i);
        }
        return sb.toString();
    }
}
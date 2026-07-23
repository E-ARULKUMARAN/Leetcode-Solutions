class Solution {
    public String removeStars(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*' && !st.isEmpty())
            st.pop();
            else
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        sb.insert(0,st.pop());
        return sb.toString();
    }
}
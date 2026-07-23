class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='(')
            st.pop();
            else
            st.push(s.charAt(i));
        }
        return st.size();
    }
}
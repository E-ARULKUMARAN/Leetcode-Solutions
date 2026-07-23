class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Character> ch=new Stack<>();
        Stack<Integer> index=new Stack<>();
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(st.charAt(i)=='('){
                ch.push(st.charAt(i));
                index.push(i);
            }
            else if(!ch.isEmpty() && st.charAt(i)==')' && ch.peek()=='('){
                ch.pop();
                index.pop();
            }
            else if(ch.isEmpty() && st.charAt(i)==')'){
                st.deleteCharAt(i);
                n--;
                i--;
            }
        }
        while(!ch.isEmpty()){
            st.deleteCharAt(index.pop());
            ch.pop();
        }
        return st.toString();
    }
}
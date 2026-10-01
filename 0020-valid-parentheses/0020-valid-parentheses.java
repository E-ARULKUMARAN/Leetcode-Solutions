class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char st[]=new char[n];
        int top=-1;
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            st[++top]=x;
            else{
                if(top==-1) return false;
                char top_element=st[top--];
                if(x==')' && top_element!='(' || x=='}' && top_element!='{' || x==']' && top_element!='[')
                return false;
            }  
        }
        return top==-1;
        
    }
}
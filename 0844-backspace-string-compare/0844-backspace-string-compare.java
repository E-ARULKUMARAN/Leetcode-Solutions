class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length(),m=t.length();
        Stack<Character> sStack=new Stack<>();
        Stack<Character> tStack=new Stack<>();
        for(int i=0;i<n;i++){
            if(!sStack.isEmpty() && s.charAt(i)=='#'){
                sStack.pop();
            }
            else
            sStack.push(s.charAt(i));
        }
        for(int i=0;i<m;i++){
            if(!tStack.isEmpty() && t.charAt(i)=='#'){
                tStack.pop();
            }
            else
            tStack.push(t.charAt(i));
        }
        StringBuilder sSb=new StringBuilder();
        StringBuilder tSb=new StringBuilder();
        while(!sStack.isEmpty()){
            if(sStack.peek()=='#'){
                sStack.pop();
                continue;
            }
            sSb.insert(0,sStack.pop());
        }
        while(!tStack.isEmpty()){
            if(tStack.peek()=='#'){
                tStack.pop();
                continue;
            }
            tSb.insert(0,tStack.pop());
        }
        return sSb.toString().equals(tSb.toString());
    }
}
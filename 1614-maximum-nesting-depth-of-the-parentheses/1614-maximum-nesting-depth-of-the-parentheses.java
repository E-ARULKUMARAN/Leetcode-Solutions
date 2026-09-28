class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int res=0,cur=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cur++;
                res=Math.max(res,cur);
            }
            else if(s.charAt(i)==')'){
                cur--;
            }
        }
        return res;
    }
}
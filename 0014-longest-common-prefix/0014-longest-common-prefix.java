class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEnd=false;
    int kids=0;
}
class Solution {
    TrieNode root;
    Solution(){
        root=new TrieNode();
    }
    void insert(String s){
        TrieNode n=root;
        for(char c:s.toCharArray()){
            int i=c-'a';
            if(n.children[i]==null){
                n.children[i]=new TrieNode();
                n.kids++;
            }
            n=n.children[i];
        }
        n.isEnd=true;
    }
    public String longestCommonPrefix(String[] strs) {
        for(String s:strs){
            insert(s);
        }
        TrieNode n=root;
        StringBuilder sb=new StringBuilder();
        while((n.isEnd!=true && n!=null) && n.kids==1){
            for(int i=0;i<26;i++){
                if(n.children[i]!=null){
                    sb.append((char)(i+'a'));
                    n=n.children[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}
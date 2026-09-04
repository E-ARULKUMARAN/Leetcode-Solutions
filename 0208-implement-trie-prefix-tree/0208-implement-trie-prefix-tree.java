class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEnd=false;
}
class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode n=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(n.children[i]==null){
                n.children[i]=new TrieNode();
            }
            n=n.children[i];
        }
        n.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode n=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            n=n.children[i];
            if(n==null){
                return false;
            }
        }
        return n.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode n=root;
        for(char c:prefix.toCharArray()){
            int i=c-'a';
            n=n.children[i];
            if(n==null){
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
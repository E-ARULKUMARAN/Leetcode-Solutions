/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    void postOrder(Node root,List<Integer> list){
        if(root==null){return;}
        for(Node child:root.children){
            postOrder(child,list);
        }
        list.add(root.val);  
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        return list;
    }
}
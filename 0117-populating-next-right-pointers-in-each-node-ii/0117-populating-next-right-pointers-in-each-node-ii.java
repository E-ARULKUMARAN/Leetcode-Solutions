/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){return root;}
        Queue<Node> q=new ArrayDeque<>();
        q.offer(root);
        Node safe=null;
        while(!(q.isEmpty())){
            int n=q.size();
            safe=null;
            for(int i=0;i<n;i++){
                Node t=q.poll();
                if(safe==null){
                    safe=t;
                }
                else{
                    safe.next=t;
                    safe=t;
                }
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
            safe.next=null;
        }
        return root;
    }
}
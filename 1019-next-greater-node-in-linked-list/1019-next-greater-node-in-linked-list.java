/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode Nhead=null;
        int c=0;
        while(head!=null){
            ListNode t=head;
            head=head.next;
            t.next=Nhead;
            Nhead=t;
            c++;
        }
        System.out.print(c);
        Stack<Integer> s=new Stack<>();
        int [] res=new int[c];
        ListNode t=Nhead;
        int i=c-1;
        while(t!=null){
            while(!s.isEmpty() && s.peek()<=t.val){
                s.pop();
            }
            if(!s.isEmpty()){
                res[i]=s.peek();
            }
            else{
                res[i]=0;
            }
            s.push(t.val);
            i--;
            t=t.next;
        }
        return res;
    }
}
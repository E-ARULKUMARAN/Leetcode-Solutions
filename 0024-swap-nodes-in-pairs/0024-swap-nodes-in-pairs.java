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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null ){return head;}
        ListNode safe=null,prev=head,curr=head.next,curnext=head.next.next;
        while(prev.next!=null){
            curr.next=prev;
            prev.next=curnext;
            if(safe!=null)
            safe.next=curr;
            safe=prev;
            if(prev==head){
                head=curr;
            }
            if(prev.next==null ||  curr.next==null ){
                return head;
            }
            prev=prev.next;
            curr=prev.next;
            if(curr==null){
                return head;
            }
            curnext=curr.next;
        }
        return head;
    }
}
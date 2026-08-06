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
    public ListNode mergeNodes(ListNode head) {
        ListNode t=head;
        while(t.next.next!=null){
            if(t.next.val==0){
                t=t.next;
            }
            t.val+=t.next.val;
            t.next=t.next.next;
        }
        t.next=null;
        return head;
    }
}
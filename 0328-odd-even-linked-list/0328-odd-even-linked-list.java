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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode last=head;
        while(last.next!=null) last=last.next;
        ListNode cur=head.next,temp,prev=head,last1=last;
        while(prev!=last){
            temp=cur;
            if(cur==last ){
                if(last.next==null)
                break;
                last=last.next;
            }
            cur=cur.next.next;
            prev.next=temp.next;
            prev=prev.next;
            last1.next=temp;
            last1=last1.next;
            temp.next=null;
        }
        return head;
    }
}
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
    ListNode reverse(ListNode head){
            ListNode revHead=null;
            while(head!=null){
                ListNode t=head;
                head=head.next;
                t.next=revHead;
                revHead=t;
            }
            return revHead;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp=head;
        int i=0,k=1;
        ListNode start=head,nextStart=null,prev=null;
        while(temp!=null){
            i++;
            if(i==k && k%2==0 || temp.next==null && i%2==0){
                nextStart=temp.next;
                temp.next=null;
                ListNode revhead=reverse(start);
                if(prev!=null)
                prev.next=revhead;
                start.next=nextStart;
                prev=start;
                start=nextStart;
                i=0;
                k++;
                temp=nextStart;
            }
            else if(i==k){
                prev=temp;
                start=temp.next;
                i=0;
                k++;
                temp=temp.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
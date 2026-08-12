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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){return head;}
        ListNode nHead=null,nt=null,t=head,safe=null;
        while(t!=null){
            if(t.val>=x){
                if(nHead==null){
                    nHead=t;
                    if(t==head){
                    head=head.next;
                    t=head;
                    safe=head;
                    }
                    else{
                        safe.next=t.next;
                        t=t.next;
                    }
                    nt=nHead;
                }
                else if(t==head){
                    nt.next=t;
                    head=head.next;
                    t=head;
                    nt=nt.next;
                    safe=head;
                }
                else{
                    nt.next=t;
                    safe.next=t.next;
                    t=t.next;
                    nt=nt.next;
                }
            }
            else{
                safe=t;
                t=t.next;
            }
        }
        if(nt!=null){
            nt.next=null;
        }
        if(safe==null){
            head=nHead;
        }
        if(nHead!=null && safe!=null){
            safe.next=nHead;
        }
        return head;
    }
}
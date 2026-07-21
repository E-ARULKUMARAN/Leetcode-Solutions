/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode last=headA;
        while(last.next!=null){
            last=last.next;
        }
        last.next=headA;
        ListNode slow=headB,fast=headB;
        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
        if(isCycle==false){ 
            last.next=null;
            return null;
        }
        ListNode start=headB;
        while(start!=slow){
            start=start.next;
            slow=slow.next;
        } 
        last.next=null;
        return start;
    }
}
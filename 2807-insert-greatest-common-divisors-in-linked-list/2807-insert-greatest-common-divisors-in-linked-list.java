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
    int findgcd(int a,int b){
        if(b==0)
        return a;
        return findgcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode t=head;
        while(t.next!=null){
            ListNode n=new ListNode(findgcd(t.val,t.next.val));
            n.next=t.next;
            t.next=n;
            t=n.next;
        }
        return head;
    }
}
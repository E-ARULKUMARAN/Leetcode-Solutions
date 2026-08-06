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
    ListNode reverse(ListNode head) {
        ListNode nHead = null;
        while (head != null) {
            ListNode t = head;
            head = head.next;
            t.next = nHead;
            nHead = t;
        }
        return nHead;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode NewHead = reverse(head);
        int carry = 0, p = 1;
        ListNode t = NewHead;
        ListNode revHead = null;
        while (t != null) {
            p = t.val * 2;
            p += carry;
            ListNode n = new ListNode(p % 10);
            carry = p / 10;
            n.next = revHead;
            revHead = n;
            t = t.next;
        }
        if (carry != 0) {
            ListNode n = new ListNode(carry);
            n.next = revHead;
            revHead = n;
        }
        return revHead;
    }
}
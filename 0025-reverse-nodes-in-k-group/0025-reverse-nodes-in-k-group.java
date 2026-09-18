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
        ListNode revhead = null;
        while (head != null) {
            ListNode t = head;
            head = head.next;
            t.next = revhead;
            revhead = t;
        }
        return revhead;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        int i = 0;
        ListNode temp = head;
        ListNode start = head;
        ListNode prev = null, nextStart = null;
        while (temp != null) {
            i++;
            if (i == k) {
                nextStart = temp.next;
                temp.next = null;
                ListNode revhead = reverse(start);
                if (start == head) {
                    head = revhead;
                }
                if (prev != null)
                    prev.next = revhead;
                start.next = nextStart;
                prev = start;
                start = nextStart;
                i = 0;
                temp = nextStart;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
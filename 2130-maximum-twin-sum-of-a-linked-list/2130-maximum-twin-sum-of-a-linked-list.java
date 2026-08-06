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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode safe = slow.next, revHead = null;
        slow.next = null;
        while (safe != null) {
            ListNode t = safe;
            safe = safe.next;
            t.next = revHead;
            revHead = t;
        }
        int res = 0;
        ListNode t1 = head, t2 = revHead;
        while (t1 != null && t2 != null) {
            if (res < (t1.val + t2.val)) {
                res = t1.val + t2.val;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return res;
    }
}
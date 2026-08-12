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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t = head;
        int c = 0;
        while (t != null) {
            c++;
            t = t.next;
        }
        int endK = c - k + 1;
        int i = 0;
        ListNode Kth = null, end = null;
        t = head;
        while (t != null) {
            i++;
            if (i == k) {
                Kth = t;
            }
            if (i == endK) {
                end = t;
            }
            t = t.next;
        }
        int safe = Kth.val;
        Kth.val = end.val;
        end.val = safe;
        return head;
    }
}
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode t = head, prev = head;
        Arrays.sort(nums);
        while (t != null) {
            int index = Arrays.binarySearch(nums, t.val);
            boolean p = index >= 0;
            if (p && t == head) {
                head = head.next;
                t = head;
                prev = head;
            } else if (p) {
                prev.next = t.next;
                t = t.next;
            } else {
                prev = t;
                t = t.next;
            }
        }
        return head;
    }
}
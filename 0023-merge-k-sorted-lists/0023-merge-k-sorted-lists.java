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
    ListNode reshead=null;
    void merge(ListNode h2) {
        if (reshead == null) {
            reshead=h2;
            return ;
        }
        if (h2 == null) {
            return ;
        }
        ListNode h1=reshead;
        ListNode head = null;
        if (h1.val < h2.val) {
            head = h1;
            h1 = h1.next;
        } else {
            head = h2;
            h2 = h2.next;
        }
        ListNode t = head;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                t.next = h1;
                h1 = h1.next;
            } else {
                t.next = h2;
                h2 = h2.next;
            }
            t=t.next;
        }
        if (h1 != null) {
            t.next = h1;
        }
        if (h2 != null) {
            t.next = h2;
        }
        reshead=head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ListNode head=null;
        for(int i=0;i<n;i++){
            merge(lists[i]);
        }
        return reshead;
    }
}
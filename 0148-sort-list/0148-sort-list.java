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
    // Normal approach
    public ListNode sortList(ListNode head) {
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=l.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
}
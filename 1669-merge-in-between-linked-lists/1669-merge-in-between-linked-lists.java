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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t=list1,safe=null,last=list2;
        int i=0;
        while(i<=b){
            if(i<a){
                safe=t;
            }
            t=t.next;
            i++;
        }
        safe.next=list2;
        while(last.next!=null){
            last=last.next;
        }
        last.next=t;
        return list1;
    }
}
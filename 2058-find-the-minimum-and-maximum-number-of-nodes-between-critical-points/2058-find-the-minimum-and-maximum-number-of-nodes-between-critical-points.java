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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1,prev=-1,end=-1,m=Integer.MAX_VALUE;
        ListNode temp=head;
        int[] res={-1,-1};
        if(head.next==null){return res;}
        int k=2;
        while(temp.next.next!=null){
            if((temp.val < temp.next.val && temp.next.val > temp.next.next.val) || (temp.val > temp.next.val && temp.next.val < temp.next.next.val)){
                if(first==-1){
                    first=k;
                    prev=k;
                    end=k;
                }
                else{
                    prev=end;
                    end=k;
                    m=Math.min(end-prev,m);
                }
            }
            temp=temp.next;
            k++;
        }
        if(first==prev && prev==end){
            return res;
        }
        res[0]=m;
        res[1]=end-first;
        return res;
    }
}
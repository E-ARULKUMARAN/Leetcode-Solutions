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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int c=0;
        ListNode t=head;
        while(t!=null){
            c++;
            t=t.next;
        }
        int count=(c+k-1)/k,carry=c%k;
        ListNode [] res=new ListNode[k];
        Arrays.fill(res,null);
        t=head;
        int i=0,j=0;
        ListNode temp=null;
        while(t!=null){
            i++;
            if(i==count || t.next==null){
                temp=t;
                t=t.next;
                temp.next=null;
                res[j++]=head;
                head=t;
                i=0;
                carry--;
                if(carry==0){
                    count--;
                }
            }
            else{
                t=t.next;
            }
        }
        return res;
    }
}
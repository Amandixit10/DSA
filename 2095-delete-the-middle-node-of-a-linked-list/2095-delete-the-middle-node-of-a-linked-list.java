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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode node=head;
        while(node!=null)
        {
            n++;
            node=node.next;
        }
        if(n==1)
        {return null;}
        int idx=0;
        ListNode prev=null;
        node=head;
        while(idx<(n/2))
        {
            prev=node;
            node=node.next;
            idx++;
        }
        prev.next=node.next;
        return head;
    }
}
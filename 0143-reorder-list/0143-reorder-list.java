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
    public void reorderList(ListNode head) {
        if(head==null)
        {return;}
        ListNode curr=head;
        ListNode prev=head;
        while(curr.next!=null)
        {prev=curr;
        curr=curr.next;}
        prev.next=null;
        ListNode dummy=head.next;
        reorderList(dummy);
        head.next=curr;
        curr.next=dummy;
    }
}
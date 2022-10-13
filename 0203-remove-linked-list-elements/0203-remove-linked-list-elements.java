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
    public ListNode removeElements(ListNode head, int val) {
        ListNode psudo_head=new ListNode(0,head);
        ListNode prev=psudo_head;
        ListNode curr=head;
while(curr!=null)
{
    if(curr.val==val)
    {
        prev.next=curr.next;
        curr=prev;
    }
    else{
    prev=curr;
    curr=curr.next;
    }
}
        return psudo_head.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 Swap Nodes in Pairs
Medium
Swapping Nodes in a Linked List
Medium
Reverse Nodes in Even Length Groups
 */
class Solution {
    public ListNode swapPairs(ListNode h) {
        if(h==null)
        {return null;}
       ListNode head=null;
        ListNode tail=null;
        ListNode node=h;
        while(node!=null)
        {
            ListNode curr=new ListNode(node.val);
            if(tail==null)
            {
                head=tail=curr;
            }
            else{
                curr.next=head;
                head=curr;
            }
            node=node.next;
            if(head.next==tail)
            {
                tail.next=swapPairs(node);
                break;
            }
        }
        return head;
    }
}
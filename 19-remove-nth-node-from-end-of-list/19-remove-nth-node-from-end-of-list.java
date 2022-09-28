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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f=head;
        ListNode s=head;
        int dis=0;
        while(f.next!=null)
        {
         if(dis==n)
         {
             f=f.next;
             s=s.next;
         }
            else{
                f=f.next;
                dis++;
            }
        }
if(dis!=n)
{
    head=head.next;
}
        else{
        s.next=s.next.next;
            }
        return head;
    }
}
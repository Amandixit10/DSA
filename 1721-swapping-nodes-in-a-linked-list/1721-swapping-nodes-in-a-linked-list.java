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
    public ListNode swapNodes(ListNode head, int k) {
      int n=1;
        ListNode node=head;
        ListNode node1=head;
        ListNode node2=head;
        while(node!=null)
        {
          if(n<=k)
          {
              node1=node;
          }
            if(n>k)
            {
                node2=node2.next;
            }
            node=node.next;
            n++;
        }
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
        return head;
    }
}
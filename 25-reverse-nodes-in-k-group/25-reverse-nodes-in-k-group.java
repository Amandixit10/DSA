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
    public ListNode reverseKGroup(ListNode h, int k) {
        if(h==null)
        {return null;}
        ListNode head=null;
        ListNode tail=null;
        ListNode node=h;
        int n=0;
        while(node!=null)
        {
            ListNode curr=new ListNode(node.val,null);
          if(tail==null)
          {
           head=tail=curr;   
          }
            else{
                curr.next=head;
                head=curr;
            }
        // display(head);
        node=node.next;
        n++;
        if(n%k==0)
        {break;}
    }
      //  display(head);
    if(n%k==0)
    {   
        tail.next=reverseKGroup(node,  k);
    }
    return n>=k?head:h;
}
    void display(ListNode node)
    {
        while(node!=null)
        {
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }
}
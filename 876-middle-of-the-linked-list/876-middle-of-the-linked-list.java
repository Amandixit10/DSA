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
    public ListNode middleNode(ListNode head) {
       List<ListNode> list=new ArrayList<>();
        ListNode node=head;
        while(node!=null)
        {
            list.add(node);
            node=node.next;
        }
        int i=0;
        int j=list.size()-1;
        while(j-i>1)
        {
        j--;
            i++;
        }
        return list.get(j);
    }
}
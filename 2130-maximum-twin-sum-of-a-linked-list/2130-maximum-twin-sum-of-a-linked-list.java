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
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
    ListNode node=head;
        while(node!=null)
        {
            list.add(node.val);
            node=node.next;
        }
        int i=0;
        int j=list.size()-1;
        int max=0;
        while(i<j)
        {
            max=Math.max(max,list.get(i)+list.get(j));
            i++;
            j--;
        }
        return max;
    }
}
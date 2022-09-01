/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->(b-a));
    public int goodNodes(TreeNode root) {
        return help(root);
    }
    int help(TreeNode root)
    {
        if(root==null)
        {return 0;}
        int ans=0;
    if(q.size()==0||q.peek()<=root.val)
        {
            ans+=1;
        }
        q.add(root.val);
        ans+=help(root.left);
        ans+=help(root.right);
        q.remove(root.val);
        return ans;
    }
}
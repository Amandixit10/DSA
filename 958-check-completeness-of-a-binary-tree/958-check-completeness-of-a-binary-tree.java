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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean isend=false;
        while(q.size()>0)
        {
            TreeNode node=q.remove();
            if(node==null)
            {isend=true;
            continue;}
            if(isend)
            {return false;}
            q.add(node.left);
            q.add(node.right);
        }
        return true;
    }
}
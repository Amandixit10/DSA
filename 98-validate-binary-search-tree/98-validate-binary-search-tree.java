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
    public boolean isValidBST(TreeNode root) {
        boolean left=validate(root.left,root.val,Long.MIN_VALUE);
        boolean right=validate(root.right,Long.MAX_VALUE,root.val);
        return left&right;
    }
    boolean validate(TreeNode root,long max,long min)
    {
        if(root==null)
        {return true;}
        if(root.val>=max||root.val<=min)
        {return false;}
        boolean left=validate(root.left,root.val,min);
        boolean right=validate(root.right,max,root.val);
        return left&right;
    }
}
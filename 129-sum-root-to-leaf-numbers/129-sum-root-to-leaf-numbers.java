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
    public int sumNumbers(TreeNode root) {
        return helper(root,"");
    }
    int helper(TreeNode root,String asf)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            asf+=root.val;
            return asf.length()>0?Integer.parseInt(asf):0;
        }
        return helper(root.left,asf+root.val)+helper(root.right,asf+root.val);
    }
}
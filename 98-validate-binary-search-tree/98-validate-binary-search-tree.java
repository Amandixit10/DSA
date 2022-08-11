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
        if(root==null)
        {return true;}
    return isValidBST(root.left)&isValidBST(root.right)&(help(root.left,0,root.val))&(help(root.right,1,root.val));
    }
    boolean help(TreeNode node,int flag,int val)
    {
        if(node==null)
        {return true;}
        if(flag==0)
        {
         if(node.val>=val)
         {return false;}
            return help(node.left,flag,val)&help(node.right,flag,val);
        }
                   if(node.val<=val)
         {return false;}
            return help(node.left,flag,val)&help(node.right,flag,val);  
        }
}
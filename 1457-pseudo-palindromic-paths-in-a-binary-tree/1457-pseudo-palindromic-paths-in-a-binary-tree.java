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
    public int pseudoPalindromicPaths (TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode root,int xor)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.right==null&&root.left==null)
        {
           int val=(1<<root.val);
            val^=xor;
            if(val==0||((val&(val-1))==0))
            {return 1;}
            return 0;
        }
        int val=(1<<root.val);
        int ans=helper(root.right,xor^val)+helper(root.left,xor^val);
        return ans;
    }
}
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
    public int maxPathSum(TreeNode root) {
        return maxPath(root);
    }
    int depth(TreeNode root)
    {
        if(root==null)
        {return 0;}
        return Math.max(root.val,root.val+Math.max(depth(root.left),depth(root.right)));
    }
    int maxPath(TreeNode root)
    {
        if(root==null)
        {return Integer.MIN_VALUE;}
        int left=depth(root.left)+root.val;
        int right=depth(root.right)+root.val;
        int both=left+right-root.val;
        int includingRoot=Math.max(both,Math.max(right,left));
        int excludingRoot= Math.max(maxPath(root.left),maxPath(root.right));
        int ans=Math.max(includingRoot,excludingRoot);
        ans=Math.max(root.val,ans);
        return ans;
    }
}
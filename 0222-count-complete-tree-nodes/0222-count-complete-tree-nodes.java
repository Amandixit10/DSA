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
    public int countNodes(TreeNode root) {
        int h=height(root);
        if(h<0)
        {
            return 0;
        }
        return height(root.right)==h-1?(1<<h)+countNodes(root.right):(1<<(h-1))+countNodes(root.left);
    }
    int height(TreeNode root)
    {
        return root==null?-1:1+height(root.left);
    }
}
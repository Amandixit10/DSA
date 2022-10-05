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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode node=new TreeNode(val,root,null);
            return node;
        }
        helper(root,root,val,depth-1,-1);
        return root;
    }
    void helper(TreeNode root,TreeNode prev,int val,int depth,int dir)
    {
        if(root==null)
        {
            if(depth==0)
            {
                if(dir==-1)
                {
                    prev.left=new TreeNode(val,null,null);
                }
                else{
                    prev.right=new TreeNode(val,null,null);
                }
            }
            return;}
        if(depth==0)
        {
            if(dir==-1)
            {
                TreeNode node=new TreeNode(val,root,null);
                prev.left=node;
            }
                else{
                   TreeNode node=new TreeNode(val,null,root);
                prev.right=node; 
                }
            }
        helper(root.left,root,val,depth-1,-1);
        helper(root.right,root,val,depth-1,1);
    }
}
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
    public String tree2str(TreeNode root) {
     return helper(root);   
    }
    String helper(TreeNode root)
    {
        if(root==null)
        {return "";}
String left=helper(root.left);
String right=helper(root.right);
       String ans=root.val+"";
        if(left.length()==0&&right.length()==0)
        {return ans;}
        if(right.length()==0)
        {
            ans=ans+"("+left+")";
        }
        else{
            ans=ans+"("+left+")"+"("+right+")";
        }
        return ans;
    }
}
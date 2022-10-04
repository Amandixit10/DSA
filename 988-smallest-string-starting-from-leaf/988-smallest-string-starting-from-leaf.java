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
    TreeSet<String> set=new TreeSet<>();
    public String smallestFromLeaf(TreeNode root) {
        helper(root,"");
        return set.first();
    }
    void helper(TreeNode root,String asf)
    {
if(root==null)
{
    return;
}
        if(root.left==null&&root.right==null)
        {
            asf=(char)(root.val+'a')+asf;
            set.add(asf);
            return;
        }
        asf=(char)(root.val+'a')+asf;
        helper(root.left,asf);
        helper(root.right,asf);
    }
}
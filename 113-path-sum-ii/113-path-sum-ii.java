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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,new ArrayList<>());
return list;
    }
    void helper(TreeNode root,int sum,List<Integer> x)
    {
        if(root==null)
        {return;}
        if((root.left==null&&root.right==null))
        {
            if(sum-root.val==0)
            {
                x.add(root.val);
                list.add(new ArrayList<>(x));
                x.remove(x.size()-1);
            }
            return;
        }
        x.add(root.val);
        helper(root.left,sum-root.val,x);
        helper(root.right,sum-root.val,x);
        x.remove(x.size()-1);
    }
}
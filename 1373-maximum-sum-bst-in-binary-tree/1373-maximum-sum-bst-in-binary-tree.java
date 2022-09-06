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
    int ans=0;
    public int maxSumBST(TreeNode root) {
    helper(root);
        return ans;
    }
    int [] helper(TreeNode root)
    {
        if(root==null)
        {
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int left[]=helper(root.left);
        int right[]=helper(root.right);
        if(!(left!=null&&
            right!=null&&
            root.val>left[1]&&
            root.val<right[0]))
        {return null;}
        int sum=root.val+left[2]+right[2];
        ans=Math.max(ans,sum);
        int min=Math.min(left[0],root.val);
        int max=Math.max(right[1],root.val);
                    
        return new int[]{min,max,sum};
    }
}
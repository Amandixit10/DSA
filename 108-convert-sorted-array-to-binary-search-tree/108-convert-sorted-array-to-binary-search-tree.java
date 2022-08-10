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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return makeBST(0,n-1,nums);
    }
    TreeNode makeBST(int lo,int hi,int nums[])
    {
        if(lo>hi)
        {
            return null;
        }
        int mid=lo+(hi-lo)/2;
      TreeNode root=new TreeNode(nums[mid],null,null);
        root.left=makeBST(lo,mid-1,nums);
        root.right=makeBST(mid+1,hi,nums);
        return root;
    }
}
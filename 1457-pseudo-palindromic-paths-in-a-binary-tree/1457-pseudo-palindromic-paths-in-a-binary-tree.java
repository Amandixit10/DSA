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
    int ar[]=new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
        return helper(root);
    }
    int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.right==null&&root.left==null)
        {
            ar[root.val]+=1;
             int odd=0;
            int even=0;
            for(int i:ar)
            {
                if(i%2==0)
                {even++;}
                else{odd++;}
            }
            ar[root.val]-=1;
            if(odd==0||odd==1)
            {return 1;}
            return 0;
        }
        ar[root.val]+=1;
        int ans=helper(root.right)+helper(root.left);
        ar[root.val]-=1;
        return ans;
    }
}
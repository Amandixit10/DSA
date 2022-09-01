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
    List<Long> list=new ArrayList<>();
    int mod=1000000007;
    public int maxProduct(TreeNode root) {
        long sum=findSum(root);
        long max=0;
        for(long i:list)
        {
            max=Math.max(max,i*(sum-i));
        }
        return (int)(max%mod);
    }
   long findSum(TreeNode root)
    {
        if(root==null)
        {return 0;}
       long sum=findSum(root.left)+findSum(root.right)+root.val;
       list.add(sum);
       return sum;
    }
}
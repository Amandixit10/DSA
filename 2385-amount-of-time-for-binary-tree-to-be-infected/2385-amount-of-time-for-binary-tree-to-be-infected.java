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
    ArrayList<Integer> ar[]=new ArrayList[100001];
    public int amountOfTime(TreeNode root, int start) {
        for(int i=0;i<100001;i++)
        {
            ar[i]=new ArrayList<>();
        }
        fill(root,-1);
        return helper(start,-1,new HashSet());
    }
    int helper(int src,int par,HashSet<Integer> set)
    {
        int max=0;
        for(int i:ar[src])
        {
            if(i!=par)
            {
        max=Math.max(max,1+helper(i,src,set));   
            }
            }
        return max;
    }
    void fill(TreeNode root,int par)
    {
        if(root==null)
        {return;}
        if(par!=-1)
        {
            ar[root.val].add(par);
            ar[par].add(root.val);
        }
        fill(root.left,root.val);
        fill(root.right,root.val);
    }
}
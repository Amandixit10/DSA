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
    HashMap<Integer,Integer> map=new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        solve(root);
for(int i:map.keySet())
{
    if(map.containsKey(k-i))
    {
        if(k-i==i)
        {
            if(map.get(i)>1){return true;}
    }
        else{
            return true;
        }
    }
}
        return false;
    }
   void solve(TreeNode root)
    {
        if(root==null)
        {return;}
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        solve(root.left);
        solve(root.right);
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> a=new ArrayList<>();
        List<TreeNode> b=new ArrayList<>();
        path(root,p,a);
        path(root,q,b);

         int i=0;
        int j=0;
        while(!(a.get(i).equals(b.get(j))))
        {
            if(a.size()-i>b.size()-j)
            {i++;}
            else if(b.size()-j>a.size()-i)
            {j++;}
            else{
                i++;
                j++;
            }
        }

        return b.get(j);
    }
   boolean path(TreeNode root,TreeNode node,List<TreeNode> list)
    {
        if(root==null)
        {
            return false;
        }
        if(root.equals(node))
        {list.add(node);
        return true;}
        if(path(root.left,node,list))
        {list.add(root);
        return true;
        }
      if(path(root.right,node,list))
      {
          list.add(root);
          return true;
      }
       return false;
        
    }
}
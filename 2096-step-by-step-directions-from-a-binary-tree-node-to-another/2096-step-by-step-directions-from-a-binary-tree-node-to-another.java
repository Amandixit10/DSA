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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s=new StringBuilder();
        StringBuilder d=new StringBuilder();
        find(root,startValue,s);
        find(root,destValue,d);
        s.reverse();
        d.reverse();
        int i=0;
        int j=0;
        while(i<s.length()&&j<d.length()&&(s.charAt(i)==d.charAt(j)))
        {
            i++;
            j++;
        }
        StringBuilder ans=new StringBuilder();
        while(i<s.length())
        {
            ans.append("U");
            i++;
        }
        while(j<d.length())
        {
        ans.append(d.charAt(j));
            j++;
        }
        return ans.toString();
        }
    boolean find(TreeNode root,int val,StringBuilder s)
    {
        if(root.val==val)
        {return true;}
        if(root.left!=null&&find(root.left,val,s))
        {s.append("L");}
        else if(root.right!=null&&find(root.right,val,s))
        {
            s.append("R");
        }
        return s.length()>0;
    }
}
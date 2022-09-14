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
    public boolean isCompleteTree(TreeNode root) {
        int depth=findDepth(root);
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
    q.add(root);
    int level=1;
        int count=0;
        while(q.size()>0)
        {
            int size=q.size();
            boolean isnull=false;
            while(size-->0)
            {
                TreeNode node=q.remove();
                if(level==depth-1)
                {
            if(isnull&&(node.right!=null||node.left!=null))
                 {return false;}
            if(node.left==null&&node.right!=null)
            {return false;}
                    if(node.left==null||node.right==null)
                    {isnull=true;}
                }
                else{
                if(node.left!=null)
                {q.add(node.left);}
                if(node.right!=null)
                {q.add(node.right);}
                }
                count++;
            }
            if(count!=((1<<level)-1))
            {
                return false;}
            level+=1;
        }
        return true;
    }
    int findDepth(TreeNode root)
    {
        if(root==null)
        {return 0;}
        return Math.max(findDepth(root.left),findDepth(root.right))+1;
    }
}
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     return build(preorder,inorder,0,preorder.length-1,0,preorder.length-1); 
    }
    TreeNode build(int pre[],int in[],int prel,int prer,int inl,int inr)
    {
        //System.out.println(prel+" "+prer);
        if(prel>prer)
        {
            return null;
        }
        TreeNode root=new TreeNode(pre[prel]);
        int i=0;
        while(in[i]!=pre[prel])
        {
            i++;
        }
        int add=i-inl+1;
        root.left=build(pre,in,prel+1,prel+add-1,inl,i-1);
        root.right=build(pre,in,prel+add,prer,i+1,inr);
        return root;
    }
}
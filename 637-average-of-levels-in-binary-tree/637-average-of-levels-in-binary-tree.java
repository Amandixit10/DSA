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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int size=q.size();
            int count=0;
            long total=0;
            while(size-->0)
            {
                TreeNode node=q.remove();
                count++;
                total+=node.val;
                if(node.left!=null)
                {
                q.add(node.left);
                }
                if(node.right!=null)
                {
                q.add(node.right);
                }
            }
            list.add((total*1.0)/(count*1.0));
        }
        return list;
    }
}
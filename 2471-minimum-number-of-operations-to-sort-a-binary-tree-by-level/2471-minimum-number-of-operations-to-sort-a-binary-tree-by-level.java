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
    public int minimumOperations(TreeNode root) {
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int ans=0;
        while(q.size()>0)
        {
            int s=q.size();
            int a[]=new int[s];
            int i=0;
            while(s-->0)
            {
                TreeNode node=q.remove();
                a[i]=node.val;
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
                i++;
            }
            ans+=helper(a);
        }
        return ans;
    }
    int helper(int a[])
    {
        int n=a.length;
        int b[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],i);
            b[i]=a[i];
        }
        int ans=0;
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
                int x=map.get(b[i]);
                map.put(b[i],i);
                map.put(a[i],x);
               int t=a[i];
                a[i]=a[x];
                a[x]=t;
                ans++;
            }
        }
        return ans;
    }
}
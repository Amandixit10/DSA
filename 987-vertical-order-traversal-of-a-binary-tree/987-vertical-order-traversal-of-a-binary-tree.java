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
    class pair{
        int dis;
        int level;
        int val;
        pair(int dis,int level,int val)
        {
            this.dis=dis;
            this.level=level;
            this.val=val;
        }
    }
    class store{
        int dis;
        int level;
        TreeNode node;
        store(int dis,int level,TreeNode node)
        {
            this.dis=dis;
            this.level=level;
            this.node=node;
        }
    }
    PriorityQueue<pair> pq;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
 pq=new PriorityQueue<>((a,b)->(a.dis==b.dis)?
                        ((a.level==b.level)?(a.val-b.val):(a.level-b.level)):
                        (a.dis-b.dis));  
       ArrayDeque<store> q=new ArrayDeque<>();
        q.add(new store(0,0,root));
        while(q.size()>0)
        {
            store s=q.remove();
            pq.add(new pair(s.dis,s.level,s.node.val));
            if(s.node.left!=null)
            {q.add(new store(s.dis-1,s.level+1,s.node.left));}
            if(s.node.right!=null)
            {q.add(new store(s.dis+1,s.level+1,s.node.right));}
        }
        List<List<Integer>> list=new ArrayList<>();
        while(pq.size()>0)
        {
         int dis=pq.peek().dis;
            List<Integer> x=new ArrayList<>();
            while(pq.size()>0&&pq.peek().dis==dis)
            {
             x.add(pq.remove().val);   
            }
            if(x.size()>0)
            {list.add(x);}
        }
        return list;
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
         if(root==null)
        {return list;}
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            List<Integer> num=new ArrayList<>();
            int size=q.size();
            while(size-->0)
            {
                Node node=q.remove();
                num.add(node.val);
                for(Node i:node.children)
                {
                    if(i!=null)
                    {
                        q.add(i);
                    }
                }
            }
            list.add(num);
        }
        return list;
    }
}
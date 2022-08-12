/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    class pair{
        int level;
        Node node;
        pair(int level,Node node)
        {
            this.level=level;
            this.node=node;
        }
    }
    public Node connect(Node root) {
        if(root==null)
        {return null;}
        ArrayDeque<pair> q=new ArrayDeque<>();
        q.add(new pair(0,root));
        pair prev=new pair(0,root);
        while(q.size()>0)
        {
            
            pair p=q.remove();
            if(p.node==null)
            {
              
                continue;}
            if(prev.level!=p.level)
            {
                prev.node.next=null;
            }
            else{
                prev.node.next=p.node;
            }
            prev=p;
            if(prev!=null)
            {
                
            }
            q.add(new pair(p.level+1,p.node.left));
            q.add(new pair(p.level+1,p.node.right));
        }
        prev.node.next=null;
        return root;
        }
}
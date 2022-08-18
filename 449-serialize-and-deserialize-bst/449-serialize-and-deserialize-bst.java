/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    String ans="";
    public String serialize(TreeNode root) {
        if(root==null)
        {return "";}
        ans=root.val+"-";
        fillTheQueue(root.left);
        fillTheQueue(root.right);
        return ans;
    }

    // Decodes your encoded data to tree.
    int idx=0;
    public TreeNode deserialize(String data) {
        if(data.length()==0)
        {return null;}
       String ar[]=data.split("-");
        int val=Integer.parseInt(ar[idx]);
        idx+=1;
        TreeNode root=new TreeNode(val);
        
        root.left=helper(val,val,ar);
        root.right=helper(Integer.MAX_VALUE,Integer.MAX_VALUE,ar);
        return root;
    }


void fillTheQueue(TreeNode root)
{
    if(root==null)
    {return ;}
    ans+=root.val+"-";
    fillTheQueue(root.left);
    fillTheQueue(root.right);
}
    
    TreeNode helper(int parVal,int oVal,String ar[])
    {
        if(idx>=ar.length)
        {return null;}
        int val=Integer.parseInt(ar[idx]);
        if(val>parVal||val>oVal)
        {return null;}
        TreeNode root=new TreeNode(val);
        idx+=1;
        root.left=helper(val,val,ar);
        root.right=helper(Integer.MAX_VALUE,oVal,ar);
        return root;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
      Node node=build(inorder,preorder,0,preorder.length-1,0,preorder.length-1);
      return node;
    }
    static Node build(int in[],int pre[],int is,int ie,int ps,int pe)
    {
        if(ps>pe)
        {
            return null;
        }
        int i=0;
        while(in[i]!=pre[ps])
        {
            i++;
        }
        int count=i-is+1;
        Node root=new Node(pre[ps]);
        root.left=build(in,pre,is,i-1,ps+1,ps+count-1);
        root.right=build(in,pre,i+1,ie,ps+count,pe);
        return root;
    }
    static void postorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
}

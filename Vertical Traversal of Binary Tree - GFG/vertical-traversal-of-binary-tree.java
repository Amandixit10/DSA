//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static class pair{
        Node node;
        int c;
        pair(Node node,int c)
        {
            this.node=node;
            this.c=c;
        }
    }
 static TreeMap<Integer,ArrayList<Integer>> map;
    static ArrayList <Integer> verticalOrder(Node root)
    {
        map=new TreeMap<>();
        helper(root);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:map.keySet())
        {
         for(int j:map.get(i))
         {
             list.add(j);
         }
        }
        return list;
    }
    static void helper(Node root)
    {
        ArrayDeque<pair> q=new ArrayDeque<>();
q.add(new pair(root,0));
while(q.size()>0)
{
 int s=q.size();
 while(s-->0)
 {
     pair p=q.remove();
     int col=p.c;
     Node node=p.node;
     ArrayList<Integer> list;
     if(map.containsKey(col))
     {
    list=map.get(col);
     }
     else{
         list=new ArrayList<>();
     }
     list.add(node.data);
     map.put(col,list);
     if(node.left!=null)
     {
         q.add(new pair(node.left,col-1));
     }
      if(node.right!=null)
     {
         q.add(new pair(node.right,col+1));
     }
 }
}

    }
}
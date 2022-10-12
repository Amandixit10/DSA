//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in an undirected graph.
    public Boolean dp[];
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        dp=new Boolean[n];
       boolean visited[]=new boolean[n];
       for(int i=0;i<n;i++)
       {
           if(dp[i]!=null)
           {
               continue;
           }
           if(!visited[i]&&dfs(visited,adj,i))
           {return true;}
       }
       return false;
    }
    boolean dfs(boolean visited[],ArrayList<ArrayList<Integer>> adj,int idx)
    {
        if(visited[idx])
        {return true;
        }
        if(dp[idx]!=null)
        {return dp[idx];}
        visited[idx]=true;
        for(int i:adj.get(idx))
        {
            if(dfs(visited,adj,i))
            {
                dp[idx]=true;
                return true;}
        }
        dp[idx]=false;
        visited[idx]=false;
        return false;
    }
}
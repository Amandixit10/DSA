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
    Boolean dp[];
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
         boolean visited[]=new boolean[n];
         dp=new Boolean[n];
         int state[]=new int[n];
        for(int i=0;i<visited.length;i++)
        {
             if(dfs(adj,visited,i,state))
             {
                 return true;
             }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean visited[],int idx,int state[])
    {
if(visited[idx])
{
    return state[idx]==1;
}
if(dp[idx]!=null)
{
    return dp[idx];
}
        visited[idx]=true;
        state[idx]=1;
        for(int i:adj.get(idx))
        {
            if(dfs(adj,visited,i,state))
            {
                return dp[idx]=true;
            }
        }
        visited[idx]=false;
        state[idx]=2;
        return dp[idx]=false;
    }
}
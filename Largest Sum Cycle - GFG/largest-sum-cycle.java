//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
   int dp[];
    int max=-1;
    public long largesSumCycle(int n, int Edge[]){
for(int i=0;i<n;i++)
{
    graph.add(new ArrayList<>());
}
dp=new int[n];
for(int i=0;i<n;i++)
{
    int u=i;
    int v=Edge[i];
    if(v==-1){continue;}
    graph.get(u).add(v);
}

    boolean visited[]=new boolean[n];
    int state[]=new int[n];
    for(int i=0;i<n;i++)
    {
        if(!visited[i])
        {
            dfs(i,i,0,visited,state);
        }
    }
    for(int i:dp)
    {
        max=Math.max(max,i);
    }
    return max==0?-1:max;
    }
    public int dfs(int st,int idx,int sum,boolean visited[],int state[])
    {
        if(visited[idx])
        {
            if(state[idx]==1&&idx==st)
            {
              dp[idx]=Math.max(dp[idx],sum);  
              return dp[idx];
            }
            return -1;
        }
        if(dp[idx]!=0)
        {return dp[idx];}
        visited[idx]=true;
        state[idx]=1;
        for(int i:graph.get(idx))
        {
            dp[idx]=Math.max(dp[idx],dfs(st,i,sum+idx,visited,state));
        }
        visited[idx]=false;
        state[idx]=2;
        return dp[idx];
    }
}
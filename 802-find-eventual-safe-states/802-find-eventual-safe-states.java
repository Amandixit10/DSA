class Solution {
    ArrayList<Integer> graph[];
    Boolean dp[];
    public List<Integer> eventualSafeNodes(int[][] ar) {
        int n=ar.length;
        graph=new ArrayList[n];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<ar[i].length;j++)
          {
              graph[i].add(ar[i][j]);
          }
        }
        boolean visited[]=new boolean[n];
        dp=new Boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!haveCycle(i,visited))
            {
               set.add(i); 
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set)
        {
            list.add(i);
        }
        return list;
    }
    boolean haveCycle(int idx,boolean visited[])
    {
        if(visited[idx])
        {
            return true;
        }
       if(dp[idx]!=null)
       {
        return dp[idx];
       }
        visited[idx]=true;
        for(int i:graph[idx])
        {
            if(haveCycle(i,visited))
            {
                dp[idx]=true;
                return true;}
        }
        visited[idx]=false;
        dp[idx]=false;
        return false;
    }
}
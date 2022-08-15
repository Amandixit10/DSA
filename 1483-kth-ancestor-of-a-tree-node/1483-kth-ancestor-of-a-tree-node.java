class TreeAncestor {
    int dp[][];
    int log=1;
    int depth[];
    public TreeAncestor(int n, int[] parent) {
      while((1<<(log))<=n)  // calculating the max_jump that can be made
      {
          log++;
      }
        dp=new int[n][log];
        depth=new int[n];
        parent[0]=0;
        for(int i=0;i<n;i++)
        {
            dp[i][0]=parent[i];
        }
            for(int j=1;j<log;j++)
            {
                for(int i=0;i<n;i++)
                {
                dp[i][j]=dp[dp[i][j-1]][j-1];
                    if(i!=0)
                    {depth[i]=depth[parent[i]]+1;}
            }
        }
    
    }
    
    public int getKthAncestor(int node, int k) {
        if(k>depth[node])
        {return -1;}
        for(int i=0;i<log;i++)
        {
            if((k&(1<<i))!=0)
            {
                node=dp[node][i];
            }
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */
class Solution {
    int count[];
    int size[];
    ArrayList<Integer> tree[];
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        count=new int[n];
        size=new int[n];
        tree=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            tree[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            tree[u].add(v);
            tree[v].add(u);
        }
    int val=fill(0,-1);
        int ans[]=new int[n];
        helper(0,-1,ans);
        return ans;
    }
  int fill(int src,int par)
  {
      for(int i:tree[src])
      {
          if(i!=par)
          {
              int val=fill(i,src);
              count[src]+=count[i];
              size[src]+=count[i]+size[i];
          }
      }
      count[src]+=1;
      return size[src];
  }
    void helper(int src,int par,int ans[])
    {
        ans[src]=size[src];
        if(par!=-1)
        {
            ans[src]+=count[0]-count[src]+(ans[par]-(ans[src]+count[src]));
        }
        for(int i:tree[src])
        {
            if(i!=par)
            {
                helper(i,src,ans);
            }
        }
    }
}
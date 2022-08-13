class Solution {
    int parent[];
    public int removeStones(int[][] stones) {
        int n=stones.length;
        parent=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(stones[i][0]==stones[j][0]||stones[i][1]==stones[j][1])
                {
                    union(i,j);
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(parent[i]==i)
            {count++;}
        }
        return n-count;
    }
    void union(int i,int j)
    {
        int x=find(i);
        int y=find(j);
        if(x==y)
        {return;}
        parent[x]=y;
    }
    int find(int i)
    {
        if(parent[i]==i)
        {return i;}
        return find(parent[i]);
    }
}
class Solution {
    int par[];
    int size[];
    public int removeStones(int[][] stones) {
        int n=stones.length;
        par=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++)
        {
            make(i);
        }
        for(int i=0;i<n;i++)
        {
            int r=stones[i][0];
            int c=stones[i][1];
            for(int j=0;j<n;j++)
            {
             if(stones[j][0]==r||stones[j][1]==c)
             {
                 union(i,j);
             }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(par[i]==i)
            {count++;}
        }
        return n-count;
    }
    void make(int val)
    {
    par[val]=val;
        size[val]=1;
    }
    int find(int val)
    {
       if(par[val]==val)
       {return val;}
        return par[val]=find(par[val]);
    }
    void union(int a,int b)
    {
    a = find(a);
    b = find(b);
    if (a != b) {
        if (size[a] < size[b])
        {
        int t=a;
        a=b;
        b=t;
        }
        par[b] = a;
        size[a] += size[b];
    }
}
}
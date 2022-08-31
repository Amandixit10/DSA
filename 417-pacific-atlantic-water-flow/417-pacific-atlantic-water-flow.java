class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    boolean visited[][];
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        visited=new boolean[n][m];
        Integer a[][]=new Integer[n][m];
        Integer b[][]=new Integer[n][m];
        for(int j=0;j<m;j++)
        {
            helper(n-1,j,m,n,a,heights,1,heights[n-1][j]);
        }
         for(int j=0;j<m;j++)
        {
            helper(0,j,m,n,b,heights,-1,heights[0][j]);
        }
         for(int i=0;i<n;i++)
        {
            helper(i,0,m,n,b,heights,-1,heights[i][0]);
        }
         for(int i=0;i<n;i++)
        {
            helper(i,m-1,m,n,a,heights,1,heights[i][m-1]);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=null&&b[i][j]!=null&&a[i][j]+b[i][j]==0)
                {
                    List<Integer> x=new ArrayList<>();
                    x.add(i);
                    x.add(j);
                    list.add(x);
                }
            }
        }
        return list;
    }
    void helper(int i,int j,int m,int n,Integer ar[][],int heights[][],int val,int prev)
    {
        if(i>=n||j>=m||i<0||j<0||visited[i][j]||heights[i][j]<prev||ar[i][j]!=null)
        {return;}
        ar[i][j]=val;
        visited[i][j]=true;
     for(int x=0;x<4;x++)
     {
         helper(i+dir[x][0],j+dir[x][1],m,n,ar,heights,val,heights[i][j]);
     }
        visited[i][j]=false;
    }
}
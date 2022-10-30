class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    Integer dp[][][][];
    public int shortestPath(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new Integer[n][m][k+1][4];
        boolean visited[][]=new boolean[n][m];
        int min=Integer.MAX_VALUE;
            min=Math.min(min,dfs(n,m,0,0,grid,visited,k,0));
        return min==Integer.MAX_VALUE?-1:min;
    }
    int dfs(int n,int m,int row,int col,int grid[][],boolean visited[][],int k,int dirtn)
    {
        if(row<0||col<0||row>=n||col>=m||visited[row][col]||(grid[row][col]==1&&k<=0))
        {
            return Integer.MAX_VALUE;}
        if(row==n-1&&col==m-1)
        {return 0;}
        if(grid[row][col]==1)
        {k-=1;}
        if(dp[row][col][k][dirtn]!=null)
        {return dp[row][col][k][dirtn];}
      int min=Integer.MAX_VALUE;
        visited[row][col]=true;
        int idx=0;
      for(int i=0;i<4;i++)
      {
      int val=dfs(n,m,row+dir[i][0],col+dir[i][1],grid,visited,k,idx);  
              min=Math.min(min,val);
          idx++;
      }
        visited[row][col]=false;
        min=min==Integer.MAX_VALUE?min:min+1;
        dp[row][col][k][dirtn]=min;
        return min;
    }
}
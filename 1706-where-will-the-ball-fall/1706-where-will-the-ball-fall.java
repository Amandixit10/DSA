class Solution {
    public int[] findBall(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans[]=new int[m];
      for(int j=0;j<m;j++)
      {
              ans[j]=valid(j,grid);
          
      }
        return ans;
    }
    int valid(int j,int grid[][])
    {
        int n=grid.length;
        int m=grid[0].length;
        int row=0;
        int col=j;
        while(row<n&&col<m)
        {
            if(grid[row][col]==1)
            {
                if(col+1>=m||grid[row][col+1]!=grid[row][col])
                {return -1;}
                row+=1;
                col+=1;
            }
            else{
                if(col-1<0||grid[row][col-1]!=grid[row][col])
                {return -1;}
                row+=1;
                col-=1;
            }
        }
        return col;
    }
}
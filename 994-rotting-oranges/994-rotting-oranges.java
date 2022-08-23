class Solution {
    int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        ArrayDeque<int[]> q=new ArrayDeque<>();
        int n=grid.length;
        int m=grid[0].length;
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        if(grid[i][j]==2)
        {
            q.add(new int[]{i,j});
        }
    }
}
        int level=-1;
        while(q.size()>0)
        {
            int size=q.size();
            while(size-->0)
            {
            int ar[]=q.remove();
                int x=ar[0];
                int y=ar[1];
                for(int i=0;i<4;i++)
                {
                    int row=x+dir[i][0];
                    int col=y+dir[i][1];
                    if(row>=0&&row<n&&col>=0&&col<m&&grid[row][col]==1)
                    {
                            grid[row][col]=2;
                        q.add(new int[]{row,col});
                        }
                }
            }
            level++;
        }
        for(int i[]:grid)
        {
            for(int j:i)
            {
                if(j==1)
                {return -1;}
            }
        }
        return level==-1?0:level;
    }
}
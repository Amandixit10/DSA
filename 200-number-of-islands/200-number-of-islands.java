class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                 ans++;
                    helper(i,j,grid);
                }
            }
        }
        return ans;
    }
    void helper(int i,int j,char grid[][])
    {
        int n=grid.length;
        int m=grid[0].length;
        if(i>=n||j>=m||i<0||j<0||grid[i][j]=='0')
        {return;}
        grid[i][j]='0';
        for(int x=0;x<4;x++)
        {
            helper(i+dir[x][0],j+dir[x][1],grid);
        }
    }
}
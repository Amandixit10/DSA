class Solution {
    int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        boolean[][][] visited = new boolean[n][m][k+1];
        q.add(new int[]{0,0,k});
        int level=0;
        while(q.size()>0){
            int size=q.size();
            while(size-->0)
            {
                int[] ar = q.remove();
                int r=ar[0];
                int c=ar[1];
                int ck=ar[2];
               if(r==n-1&&c==m-1)
            {
                   return level;}
        for(int i=0;i<4;i++)
        {
            int cr=r+dir[i][0];
            int cc=c+dir[i][1];
            int cck=ck;
            if(cr>=0&&cc>=0&&cr<n&&cc<m)
            {
                if(grid[cr][cc]==1)
                {
                    cck-=1;
                }
                if(cck>=0&&!visited[cr][cc][cck])
                {
                visited[cr][cc][cck]=true;
        q.add(new int[]{cr,cc,cck});
                }
        }
        }
            }
            level+=1;
        }
        return -1;
    }
}
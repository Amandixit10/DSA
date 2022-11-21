class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        ArrayDeque<int[]> q=new ArrayDeque<>();
        int x=entrance[0];
        int y=entrance[1];
        int min=Integer.MAX_VALUE;
        int n=maze.length;
        int m=maze[0].length;
        q.add(new int[]{x,y,0});
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(q.size()>0)
        {
            int s=q.size();
            while(s-->0)
            {
                int ar[]=q.remove();
                int r=ar[0];
                int c=ar[1];
                int dis=ar[2];
               maze[r][c]='+';
                if((r==n-1||c==m-1||r==0||c==0)&&dis>0)
                {
               
                    min=Math.min(min,dis);}
                for(int i=0;i<4;i++)
                {
                int cr=r+dir[i][0];
                    int cc=c+dir[i][1];
                    if(cr>=0&&cc>=0&&cr<n&&cc<m&&maze[cr][cc]!='+')
                    {
                        maze[cr][cc]='+';
                        q.add(new int[]{cr,cc,dis+1});
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
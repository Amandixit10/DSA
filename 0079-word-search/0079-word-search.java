class Solution {
    boolean visited[][];
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
           if(dfs(i,j,board,word,0,n,m))
           {
               return true;
           }
            }
        }
       
        return false;
    }
    boolean dfs(int row,int col,char ar[][],String s,int idx,int n,int m)
    {
        if(row<0||col<0||row>=n||col>=m||visited[row][col]||ar[row][col]!=s.charAt(idx))
        {
            return false;
        }
        if(idx>=s.length()-1)
        {
            return true;
        }
        visited[row][col]=true;
        for(int i=0;i<4;i++)
        {
            if(dfs(row+dir[i][0],col+dir[i][1],ar,s,idx+1,n,m))
            {
                return true;
            }
        }
        visited[row][col]=false;
        return false;
    }
}
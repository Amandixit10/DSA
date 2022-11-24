class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                if(find(i,j,board,word,visited,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean find(int r,int c,char board[][],String word,boolean visited[][],int idx)
    {
        if(r<0||c<0||r>=board.length||c>=board[0].length||visited[r][c]||board[r][c]!=word.charAt(idx))
        {return false;}
        idx+=1;
        if(idx>=word.length())
        {return true;}
        visited[r][c]=true;
      for(int i=0;i<4;i++)
      {
          if(find(r+dir[i][0],c+dir[i][1],board,word,visited,idx))
          {return true;}
      }
        visited[r][c]=false;
        return false;
    }
}
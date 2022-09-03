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
        if(helper(i,j,n,m,visited,word,0,board))
        {return true;}
            }
        }
        return false;
    }
    boolean helper(int i,int j,int n,int m,boolean visited[][],String word,int idx,char board[][])
    {
       if(idx>=word.length())
        {
            return true;
        }
        if(i>=n||j>=m||i<0||j<0||visited[i][j]||word.charAt(idx)!=board[i][j])
        {
         return false;   
        }
        visited[i][j]=true;
        
for(int x=0;x<4;x++)
{
    int row=i+dir[x][0];
    int col=j+dir[x][1];
    if(helper(row,col,n,m,visited,word,idx+1,board))
    {return true;}
}
        visited[i][j]=false;
        return false;   
    }
}
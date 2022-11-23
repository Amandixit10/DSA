class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
               if(board[i][j]!='.')
               {
                 if(!valid(i,j,board))
                 {
                     return false;
                 }
               }
            }
        }
        for(int i=3;i<=9;i+=3)
        {
            for(int j=3;j<=9;j+=3)
            {
                if(!squareValid(i,j,board))
                {
                    return false;}
            }
        }
        return true;
    }
    boolean valid(int row,int col,char ar[][])
    {
        int val=0;
        for(int j=0;j<9;j++)
        {
            if(ar[row][j]==ar[row][col])
            {val++;}
        }
        if(val>1)
        {return false;}
        val=0;
        for(int i=0;i<9;i++)
        {
            if(ar[i][col]==ar[row][col])
            {val++;}
        }
        return val>1?false:true;
    }
    boolean squareValid(int row,int col,char ar[][])
    {
        int num[]=new int[10];
        for(int i=row-3;i<row;i++)
        {
            for(int j=col-3;j<col;j++)
            {
                if(ar[i][j]!='.')
                {
             num[ar[i][j]-'0']++;   
                if(num[ar[i][j]-'0']>1)
                {return false;}
                }
            }
        }
        return true;
    }
}
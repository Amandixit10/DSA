class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            if(!isValid(board[i]))
            {return false;}
        }
        for(int j=0;j<9;j++)
        {
            char ar[]=new char[9];
            for(int i=0;i<9;i++)
            {
                ar[i]=board[i][j];
            }
            if(!isValid(ar))
            {return false;}
        }
        for(int i=0;i<=6;i+=3)
        {
         for(int j=0;j<=6;j+=3)
         {
             if(!rep(board,i,j))
             {return false;}
         }
        }
        return true;
    }
    boolean rep(char board[][],int i,int j)
    {
        int ar[]=new int[10];
        for(int x=i;x<i+3;x++)
        {
            for(int y=j;y<j+3;y++)
            {
                if(board[x][y]!='.')
                {
               ar[board[x][y]-'0']++; 
                }
            }
        }
        for(int x=1;x<10;x++)
        {
            if(ar[x]>1)
            {return false;}
        }
        return true;
    }
    boolean isValid(char ar[])
    {
        int a[]=new int[10];
        for(int i=0;i<9;i++)
        {
            if(ar[i]!='.')
            {
            a[ar[i]-'0']++;
            }
        }
        for(int i=1;i<10;i++)
        {
            if(a[i]>1)
            {return false;}
        }
        return true;
    }
}
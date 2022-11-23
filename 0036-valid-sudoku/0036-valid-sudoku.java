class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                int val=board[i][j]-'0';
                if(!set.add(val+"in row"+i)||
                   !set.add(val+"in col"+j)||
                   !set.add(val+"in block"+(i/3+"-"+j/3)))
                {return false;}
            }
            }
        }
        return true;
    }
}
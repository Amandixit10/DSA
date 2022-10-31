class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n>=m)
        {
            for(int i=m;i<=n;i++)
            {
            if(!check(i,m,matrix,m))
            {return false;}
            }
        }
        else {
          for(int j=n;j<=m;j++)
            {
            if(!check(n,j,matrix,n))
            {return false;}
            }  
        }
        return true;
    }
    boolean check(int row,int col,int matrix[][],int fact)
    {
        for(int g=col-fact;g<col;g++)
        {
            for(int i=row-fact,j=g;j<col;j++,i++)
            {
                if(i==row-fact)
                {continue;}
                else if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    return false;}
            }
        }
           for(int g=row-fact;g<row;g++)
        {
            for(int j=col-fact,i=g;i<row;j++,i++)
            {
                if(j==col-fact)
                {continue;}
                else if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    return false;}
            }
        }
        return true;
    }
}
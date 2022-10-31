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
        //System.out.println(col+" "+row);
        for(int g=col-fact;g<col;g++)
        {
           // System.out.println(g+" "+col);
            for(int i=row-fact,j=g;j<col;j++,i++)
            {
                //System.out.print(i+"-"+j+" ");
                if(i==row-fact)
                {continue;}
                else if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    //System.out.println(i+"--"+j);
                    return false;}
            }
             //System.out.println();
        }
           for(int g=row-fact;g<row;g++)
        {
            for(int j=col-fact,i=g;i<row;j++,i++)
            {
                //System.out.print(i+"-"+j+" ");
                if(j==col-fact)
                {continue;}
                else if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    //System.out.println();
                    return false;}
            }
               //System.out.println();
        }
        //System.out.println();
        return true;
    }
}
/*
[81,37,41,94,80,13,50,26,75],
[67,81,37,41,94,80,13,50,26],
[50,67,81,37,41,94,80,13,50],
[20,50,67,81,37,41,94,80,13],
[54,20,50,67,81,37,41,94,80],
[96,54,20,50,67,81,37,41,94],
[53,96,54,20,50,67,81,37,41],
[0,53,96,54,20,50,67,81,37],
[36,33,53,96,54,20,50,67,81]]*/
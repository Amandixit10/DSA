class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
    if(isEqual(mat,target))
    {
        return true;
    }
        rotate(mat); // 90
        if(isEqual(mat,target))
        {
            return true;
        }
        rotate(mat); // 180
        if(isEqual(mat,target))
        {
            return true;
        }
          rotate(mat); // 270
        if(isEqual(mat,target))
        {
            return true;
        }
        return false;
}
    void rotate(int mat[][])
    {
        int n=mat.length;
        int ans[][]=new int[n][n];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][n-i-1]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=ans[i][j];
            }
        }
    }
    boolean isEqual(int a[][],int b[][])
    {
for(int i=0;i<a.length;i++)
{
    if(!Arrays.equals(a[i],b[i]))
    {return false;}
}
        return true;
    }
}
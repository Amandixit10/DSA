class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       int ar[][]=new int[n][n]; 
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                ar[n-i-1][j]=matrix[n-j-1][n-i-1];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=ar[i][j];
            }
        }
    }
}
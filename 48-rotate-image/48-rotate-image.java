class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       int ar[][]=new int[n][n]; 
        for(int j=0;j<n;j++)
        {
            int idx=0;
            for(int i=n-1;i>=0;i--)
            {
                ar[j][idx]=matrix[i][j];
                idx++;
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
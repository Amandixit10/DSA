class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            int row=i;
            int col=i;
            int a[]=new int[n];
            int b[]=new int[n];
            for(int j=0;j<n;j++)
            {
             a[j]=matrix[row][j];
             b[j]=matrix[j][col];
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for(int j=0;j<n;j++)
            {
                if(a[j]!=j+1||b[j]!=j+1)
            {return false;}}
        }
        return true;
    }
}
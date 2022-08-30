class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
int a[]=new int[n+1];
            int b[]=new int[n+1];
            for(int j=0;j<n;j++)
            {
                a[matrix[i][j]]++;
                b[matrix[j][i]]++;
            }
            for(int j=1;j<=n;j++)
            {
if(a[j]!=1||b[j]!=1)
{return false;}
        }
        }
        return true;
    }
}
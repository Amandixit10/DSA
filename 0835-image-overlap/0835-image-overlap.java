class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
      for(int i=-n;i<=n;i++)
      {
          for(int j=-n;j<=n;j++)
          {
           max=Math.max(max,helper(i,j,img1,img2));   
          }
      }
        return max;
    }
    int helper(int si,int sj,int img1[][],int img2[][])
    {
        int n=img2.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               int row=i+si;
                int col=j+sj;
                if(row<0||row>=n||col<0||col>=n)
                {continue;}
                if(img1[row][col]==img2[i][j])
                {
                    cnt+=img1[row][col];
                }
            }
        }
        return cnt;
    }
}
class Solution {
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int n=floor.length();
        int dp[][]=new int[numCarpets+1][n];
        int p[]=new int[n];
        if(floor.charAt(0)=='1')
        {
           p[0]=1;
        }
           for(int i=1;i<n;i++)
           {
             p[i]=p[i-1];
               if(floor.charAt(i)=='1')
               {
                 p[i]+=1;
               }
           }
        for(int i=0;i<n;i++)
        {
            dp[0][i]=p[i];
        }
        for(int i=1;i<=numCarpets;i++)
        {
        for(int j=0;j<n;j++)
        {
            if(j==0)
            {
            dp[i][j]=0;
                continue;
            }
int a=floor.charAt(j)-'0'+dp[i][j-1];
            int b=0;
            if(j-carpetLen>=0)
            {
                b=dp[i-1][j-carpetLen];
            }
            dp[i][j]=Math.min(a,b);
        }
        }

        return dp[numCarpets][n-1];
           }
}
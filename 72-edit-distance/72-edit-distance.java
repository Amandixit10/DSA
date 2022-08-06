class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int  m=word2.length();
        if(Math.min(n,m)==0)
        {return Math.max(n,m);}
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][m]=n-i;
        }
        for(int j=0;j<=m;j++)
        {
            dp[n][j]=m-j;
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                char a=word1.charAt(i);
                char b=word2.charAt(j);
                    if(a==b)
                    {dp[i][j]=dp[i+1][j+1];}
                    else{
                        dp[i][j]=Math.min(1+dp[i+1][j],1+dp[i+1][j+1]);
                        dp[i][j]=Math.min(dp[i][j],1+dp[i][j+1]);
                    }
                }
            }
      /*for(int i[]:dp)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        return dp[0][0];
    }
}
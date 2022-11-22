class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
              int val=1;
            int sq=1;
                int min=Integer.MAX_VALUE;
                while(sq<=i)
                {
                    min=Math.min(min,dp[i-sq]);
                    val++;
                    sq=val*val;
                }
                dp[i]=min+1;
            }
            return dp[n];
    }
}
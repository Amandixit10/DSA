class Solution {
    int mod=1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        for(int i=1;i<=Math.min(k,target);i++)
        {
            dp[n][i]=1;
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=target;j++)
            {
            for(int l=1;l<=k;l++)
            {
                if(j-l>=0)
                {
                    dp[i][j]=(dp[i][j]+dp[i+1][j-l])%mod;
                }
            }
            }
        }
        return dp[1][target];
    }
}
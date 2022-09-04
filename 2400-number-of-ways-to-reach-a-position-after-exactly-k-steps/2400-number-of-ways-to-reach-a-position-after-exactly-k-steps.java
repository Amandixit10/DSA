class Solution {
    int mod=(int)1e9+7;
    Integer dp[][]=new Integer[4000][1001];
    public int numberOfWays(int startPos, int endPos, int k) {
        return (helper(startPos+1,endPos,k-1)+helper(startPos-1,endPos,k-1))%mod;
    }
    int helper(int s,int e,int k)
    {
        if(k<=0)
        {
            return s==e?1:0;
        }
        if(dp[s+1000][k]!=null)
        {return dp[s+1000][k];}
     dp[s+1000][k]=(helper(s+1,e,k-1)+helper(s-1,e,k-1))%mod;
        return dp[s+1000][k];
    }
}
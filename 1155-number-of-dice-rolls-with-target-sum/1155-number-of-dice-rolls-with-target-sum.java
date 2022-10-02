class Solution {
    int mod=1000000007;
    Integer dp[][];
    public int numRollsToTarget(int n, int k, int target) {
        dp=new Integer[n+1][target+1];
        return helper(n,k,target);
    }
    int helper(int n,int k,int sum)
    {
        if(sum<=0||n<=0)
        {
            if(n==0&&sum==0)
            {
                return 1;
            }
            return 0;
        }
        if(dp[n][sum]!=null)
        {return dp[n][sum];}
        int ans=0;
        for(int i=1;i<=k;i++)
        {
          ans=(ans+helper(n-1,k,sum-i))%mod;  
        }
        dp[n][sum]=ans;
        return ans;
    }
}
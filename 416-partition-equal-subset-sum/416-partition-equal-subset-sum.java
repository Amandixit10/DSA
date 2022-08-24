class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){sum+=i;}
        if(sum%2!=0)
        {return false;}
        sum/=2;
        boolean dp[][]=new boolean[nums.length][sum+1];
        for(int i=0;i<nums.length;i++)
        {dp[i][0]=true;}
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
if(i==0)
{
    if(nums[i]==j)
    {dp[i][j]=true;}
}
                else{
                dp[i][j]=dp[i-1][j];
                if(j-nums[i]>=0)
                {dp[i][j]|=dp[i-1][j-nums[i]];}
            }
        }
        }
        return dp[nums.length-1][sum];
    }
}
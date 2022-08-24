class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        if(sum%2!=0)
        {return false;}
        sum/=2;
         dp=new Boolean[nums.length][sum+1];
        boolean take=helper(1,nums,sum);
        boolean leave=helper(1,nums,sum);
        return take|leave;
    }
    boolean helper(int idx,int nums[],int sum)
    {
        if(idx>=nums.length||sum<=0)
        {
            return sum==0;
        }
        if(dp[idx][sum]!=null)
        {return dp[idx][sum];}
        boolean take=helper(idx+1,nums,sum-nums[idx]);
        boolean leave=helper(idx+1,nums,sum);
        dp[idx][sum]=take|leave;
        return take|leave;
    }
}
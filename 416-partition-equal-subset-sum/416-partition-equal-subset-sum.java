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
         dp=new Boolean[nums.length][sum+1];
        boolean take=helper(1,nums[0],nums,sum);
        boolean leave=helper(1,0,nums,sum);
        return take|leave;
    }
    boolean helper(int idx,int curr,int nums[],int sum)
    {
        if(idx>=nums.length||(sum-curr==curr))
        {
            return (sum-curr)==curr;
        }
        if(dp[idx][curr]!=null)
        {return dp[idx][curr];}
        boolean take=helper(idx+1,curr+nums[idx],nums,sum);
        boolean leave=helper(idx+1,curr,nums,sum);
        dp[idx][curr]=take|leave;
        return take|leave;
    }
}
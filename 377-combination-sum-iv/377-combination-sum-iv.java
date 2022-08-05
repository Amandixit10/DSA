class Solution {
    Integer dp[][];
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        dp=new Integer[n][100001];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int t=nums[i];
            nums[i]=nums[0];
            nums[0]=t;
      
        ans+=help(nums,0,target,(nums[0]+"-"),nums[0]);
             t=nums[i];
            nums[i]=nums[0];
            nums[0]=t;
        }
        dp[0][0]=ans;
        return ans;
    }
    int  help(int nums[],int idx,int target,String asf,int sum)
    {
        if(sum>=target||idx>=nums.length)
        {
            if(sum==target)
            {
             return 1;
            }
            return 0;
        }
        if(dp[idx][sum]!=null)
        {return dp[idx][sum];}
        int ans=0;
            for(int i=idx;i<nums.length;i++)
        {
            int t=nums[i];
            nums[i]=nums[idx];
            nums[idx]=t;
       //  help(nums,idx+1,target,asf,sum);
       ans+=help(nums,idx,target,(asf+nums[idx]+"-"),nums[idx]+sum);
             t=nums[i];
            nums[i]=nums[idx];
            nums[idx]=t;
        }
        dp[idx][sum]=ans;
        return ans;
    }
}
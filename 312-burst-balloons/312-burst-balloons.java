class Solution {
    Integer dp[][];
    public int maxCoins(int[] nums) {
        int max=0;
        int n=nums.length;
        dp=new Integer[n][n];
        for(int i=0;i<n;i++)
        {
          int left_max=help(0,i-1,1,nums[i],nums);
            int right_max=help(i+1,n-1,nums[i],1,nums);
            max=Math.max(max,nums[i]+left_max+right_max);
        }
        return max;
    }
    int help(int start,int end,int leftb,int rightb,int nums[])
    {
        if(start>=end)
        {
            if(start==end)
            {
               return leftb*nums[start]*rightb;
            }
            return 0;
        }
        if(dp[start][end]!=null)
        {
            return dp[start][end];
        }
        int max=0;
        for(int i=start;i<=end;i++)
        {
         int left_max=help(start,i-1,leftb,nums[i],nums);
            int right_max=help(i+1,end,nums[i],rightb,nums);
            int profit=nums[i]*leftb*rightb+left_max+right_max;
            max=Math.max(max,profit);   
        }
        dp[start][end]=max;
        return max;
    }
}
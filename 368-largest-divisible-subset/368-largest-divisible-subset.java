class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
ArrayList<Integer> dp[]=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=new ArrayList<>();
        }
       // System.out.println(dp.length);
        Arrays.sort(nums);
        dp[n-1].add(nums[n-1]);
       // System.out.println(dp[n-1].get(0));
        for(int i=n-2;i>=0;i--)
        {
                int max=0;
                int idx=i;
            for(int j=i;j<n;j++)
            {
                if((nums[j]%nums[i])==0)
                {
                 if(dp[j].size()>max)  
                 {
                     max=dp[j].size();
                 idx=j;
                 }
                }
            }
        
                for(int j=0;j<dp[idx].size();j++)
                {
                    dp[i].add(dp[idx].get(j));
                }
            dp[i].add(nums[i]);
            }
        int max=0;
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i].size()>max)
            {
                max=dp[i].size();
                idx=i;
            }
        }
        return dp[idx];
    }
}
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
int dp[]=new int[n];
        int nextPointer[]=new int[n];
        Arrays.sort(nums);
        dp[n-1]=1;
        nextPointer[n-1]=n-1;
        for(int i=n-2;i>=0;i--)
        {
                int max=0;
                int idx=i;
            for(int j=i;j<n;j++)
            {
                if((nums[j]%nums[i])==0)
                {
                 if(dp[j]>max)  
                 {
                     max=dp[j];
                 idx=j;
                 }
                }
            }
        dp[i]=dp[idx]+1;
            nextPointer[i]=idx;
            }
        int max=0;
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i]>max)
            {
                max=dp[i];
                idx=i;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(nextPointer[idx]!=idx)
        {
            list.add(nums[idx]);
            idx=nextPointer[idx];
        }
        list.add(nums[idx]);
        return list;
    }
}
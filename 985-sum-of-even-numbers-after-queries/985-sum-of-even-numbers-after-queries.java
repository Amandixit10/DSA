class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int even=0;
        int odd=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
       if(nums[i]%2==0)
       {
           even+=nums[i];
       }
            else {
                odd+=nums[i];
            }
        }
        int m=queries.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++)
        {
      int val=queries[i][0];
            int idx=queries[i][1];
            if(nums[idx]%2==0)
            {
                even-=nums[idx];
            }
            else{
                odd-=nums[idx];
            }
            nums[idx]+=val;
            if(nums[idx]%2==0)
            {
                even+=nums[idx];
            }
            else{
                odd+=nums[idx];
            }
            ans[i]=even;
        }
        return ans;
    }
}
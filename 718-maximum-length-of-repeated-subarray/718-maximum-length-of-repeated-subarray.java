class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int[n][m];
        int max=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(nums1[i]==nums2[j])
                {
                    dp[i][j]=1;
                    if(i<n-1&&j<m-1)
                    {
                        dp[i][j]+=dp[i+1][j+1];
                    }
                }
        
       max=Math.max(max,dp[i][j]);
            }
        }
        
        return max;
    }
}
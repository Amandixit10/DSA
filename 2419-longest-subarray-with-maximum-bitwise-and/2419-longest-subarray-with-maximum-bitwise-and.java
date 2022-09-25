class Solution {
    public int longestSubarray(int[] nums) {
     int max=0;
        int n=nums.length;
        for(int i:nums)
        {
            max=Math.max(max,i);
        }
        int l=0;
        int j=0;
        while(j<n)
        {
            int prev=j;
          if(nums[j]==max)
          {
              while(j<n&&nums[j]==max)
              {
                  j++;
              }
              l=Math.max(l,j-prev);
          }
            else{
            j++;
            }
        }
        return l;
    }
}
class Solution {
    public int maxAbsoluteSum(int[] nums) {
     int curr=0;
        int n=nums.length;
       int max=0;
        for(int i=0;i<n;i++)
        {
         if(nums[i]>curr+nums[i])
         {
             curr=nums[i];
         }
            else{
                curr+=nums[i];                
            }
            max=Math.max(max,curr);
        }
        curr=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
        if(nums[i]<curr+nums[i])
         {
             curr=nums[i];
         }
            else{
                curr+=nums[i];                
            }
            min=Math.min(min,curr);    
        }
        return Math.max(Math.abs(min),Math.abs(max));
    }
}
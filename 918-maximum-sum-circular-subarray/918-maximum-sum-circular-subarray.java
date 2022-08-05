class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int total=0;
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<n;i++)
        {
       if(nums[i]>nums[i]+curr)
       {
           curr=nums[i];
       }
            else{
                curr+=nums[i];
            }
            max=Math.max(max,curr);
            total+=nums[i];
        }
        curr=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<nums[i]+curr)
            {
                curr=nums[i];
            }
            else{
                curr+=nums[i];
            }
            min=Math.min(min,curr);
        }
       // System.out.println(max+" "+min);
        return Math.max(max,total-(min==total?0:min));
    }
}
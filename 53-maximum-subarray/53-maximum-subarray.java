class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]+curr<nums[i])
            {
                curr=nums[i];
            }
            else{
                curr+=nums[i];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}
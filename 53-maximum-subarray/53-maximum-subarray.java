class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
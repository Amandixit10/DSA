class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=2;i--)
        {
            int sum=nums[i-1]+nums[i-2];
         if(sum>nums[i])
         {return sum+nums[i];}
        }
        return 0;
    }
}
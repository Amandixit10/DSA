class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2)
        {return 0;}
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
          max=Math.max(max,nums[i]-nums[i-1]);  
        }
        return max;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(0);
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
         max=Math.max(max,sum-set.first());
            set.add(sum);
        }
        return max;
    }
}
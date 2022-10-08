class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
           int val=nums[i]+nums[j]+nums[k];
            while(j<k)
            {
           if(Math.abs(val-target)<min)
            {
                min=Math.abs(target-val);
                sum=val;
            }
              if(val>=target)
              {
               k--;
              }
                else{
                    j++;
                }
                val=nums[i]+nums[j]+nums[k];
                
            }
        }
        return sum;
    }
}
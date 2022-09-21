class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        return helper(nums,target);
    }
    int helper(int nums[],int target)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int req=sum-target;
            if(set.contains(req))
            {
                count+=1;
                sum=0;
                set=new HashSet<>();
            }
            set.add(sum);
        }
    return count;
    }
}
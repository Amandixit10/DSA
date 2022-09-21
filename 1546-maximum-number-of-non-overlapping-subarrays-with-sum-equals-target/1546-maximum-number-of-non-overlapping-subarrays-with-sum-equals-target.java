class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        return helper(nums,0,target);
    }
    int helper(int nums[],int idx,int target)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        int sum=0;
        int x=-1;
        for(int i=idx;i<nums.length;i++)
        {
            sum+=nums[i];
            int req=sum-target;
            if(set.contains(req))
            {
                x=i+1;
                break;
            }
            set.add(sum);
        }
        if(x<0)
        {return 0;}
        return 1+helper(nums,x,target);
    }
}
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int prev=-1;
            int f=0;
            for(int j=0;j<n;j++)
            {
                if(j==i)
                {continue;}
                if(nums[j]<=prev)
                {
                    f=1;
                    break;}
                prev=nums[j];
            }
           // System.out.println(prev+" "+nums[i]);
            if(f==0)
            {return true;}
        }
        return false;
    }
}
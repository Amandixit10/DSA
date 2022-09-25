class Solution {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
         if(nums[i]<nums[i-1])
         {
             if(i+1<n)
             {
                 if(nums[i-1]>=nums[i+1])
                 {
                     nums[i-1]=nums[i];
                 }
                 else if(nums[i-1]<nums[i+1])
                 {
                     nums[i]=nums[i-1];
                 }
             }
             else{
                 nums[i]=nums[i-1];
             }
             count++;
         }
        }
        if(count>1)
        {
            return false;
        }
        for(int i=1;i<n;i++)
        {
            if(nums[i]<nums[i-1])
            {
                //System.out.println(i+" "+nums[i]);
                return false;
            }
        }
        return true;
    }
}
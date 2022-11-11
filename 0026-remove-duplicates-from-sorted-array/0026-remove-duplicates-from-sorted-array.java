class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]==nums[j])
            {
                continue;
            }
nums[++i]=nums[j];
        }
        i+=1;
        int ans=i;
        while(i<n)
        {
            nums[i]=0;
            i++;
        }
        return ans;
    }
}
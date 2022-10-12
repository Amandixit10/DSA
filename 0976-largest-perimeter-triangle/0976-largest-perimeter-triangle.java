class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=n-1;
        int j=n-2;
        int k=n-3;
        while(k>=0&&!valid(i,j,k,nums))
        {
          i--;
            j--;
            k--;
        }
        if(k<0)
        {return 0;}
        return nums[i]+nums[j]+nums[k];
    }
    boolean valid(int i,int j,int k,int nums[])
    {
        if(nums[j]+nums[k]<=nums[i])
        {return false;}
        return true;
    }
}
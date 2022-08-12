class Solution {
    public int maximumTop(int[] nums, int k) {

        int n=nums.length;
        if(n==1)
        {return k%2==1?-1:nums[0];}
        int idx=k;
        int max=0;
        k-=1;
        int i=0;
        while(i<n&&k>0)
        {
          max=Math.max(max,nums[i]);
            i++;
            k--;
        }
        if(k>0)
        {
            return max;
        }
        int ans=idx>=n?0:nums[idx];
        return Math.max(max,ans);
    }
}
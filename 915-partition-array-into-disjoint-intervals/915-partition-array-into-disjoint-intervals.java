class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        int len=Integer.MAX_VALUE;
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            if(pre[i]<=suf[i+1])
            {
                return i+1;
            }
        }
        return -1;
    }
}
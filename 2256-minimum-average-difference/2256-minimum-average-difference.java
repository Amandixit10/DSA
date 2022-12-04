class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long pre[]=new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++)
        {
           pre[i]=pre[i-1]+nums[i]; 
        }
        long min=Long.MAX_VALUE;
        int idx=0;
        for(int i=0;i<n-1;i++)
        {
        long val1=pre[i]/(i+1);
        long val2=(pre[n-1]-pre[i])/(n-(i+1));
        long dif=Math.abs(val1-val2);
            if(dif<min)
            {
                min=dif;
                idx=i;
            }
        }
        if((pre[n-1]/n)<min)
        {
            idx=n-1;
        }
        return idx;
    }
}
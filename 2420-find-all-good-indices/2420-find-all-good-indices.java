class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        for(int i=1;i<n;i++)
        {
            pre[i]=1;
            if(i>1)
            {
                if(nums[i-1]<=nums[i-2])
                {
                    pre[i]=pre[i-1]+1;
                }
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=1;
            if(i<n-2)
            {
                if(nums[i+1]<=nums[i+2])
                {
                    suf[i]=suf[i+1]+1;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(pre[i]>=k&&suf[i]>=k)
            {
                list.add(i);
            }
        }
        return list;
    }
}
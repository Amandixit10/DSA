class Solution {
    public List<Integer> goodDaysToRobBank(int[]  nums, int time) {
        int n=nums.length;
        int pre[]=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++)
        {
            pre[i]=1;

            if(nums[i]<=nums[i-1])
            {
                pre[i]=pre[i-1]+1;
            }
            
        }
        int suf[]=new int[n];
         suf[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=1;
                if(nums[i]<=nums[i+1])
                {
                    suf[i]=suf[i+1]+1;
                }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(pre[i]>time&&suf[i]>time)
            {
                list.add(i);
            }
        }
        return list;
    }
}
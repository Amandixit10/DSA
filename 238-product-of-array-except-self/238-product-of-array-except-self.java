class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
    int pre[]=new int[n];
    int suf[]=new int[n];
        pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=suf[i+1]*nums[i];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a=1;
            int b=1;
            if(i!=0)
            {a=pre[i-1];}
            if(i!=n-1)
            {
                b=suf[i+1];
            }
            ans[i]=a*b;
        }
        return ans;
    }
}
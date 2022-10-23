class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ar[]=new int[n+1];
        for(int i:nums)
        {
            ar[i]++;
        }
        int x=0;
        int y=0;
        for(int i=1;i<=n;i++)
        {
            if(ar[i]==0)
            {x=i;}
            if(ar[i]>1)
            {y=i;}
        }
        return new int[]{y,x};
    }
}
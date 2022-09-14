class Solution {
    public int countArrangement(int n) {
        int ar[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            ar[i]=i;
        }
        return helper(n,ar,1);
    }
    int helper(int n,int ar[],int idx)
    {
        if(idx>n)
        {
            return 1;
        }
        int ans=0;
     for(int i=idx;i<=n;i++)
     {
         int t=ar[idx];
         ar[idx]=ar[i];
         ar[i]=t;
         if(idx%ar[idx]==0||ar[idx]%idx==0)
         {
             ans+=helper(n,ar,idx+1);
         }
         t=ar[idx];
         ar[idx]=ar[i];
         ar[i]=t;
     }
        return ans;
    }
}
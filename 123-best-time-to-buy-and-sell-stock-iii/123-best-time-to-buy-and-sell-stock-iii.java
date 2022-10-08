class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        for(int i=1;i<n;i++)
        {
            min=Math.min(min,prices[i]);
            pre[i]=Math.max(pre[i-1],prices[i]-min);
        }
        int max=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            max=Math.max(max,prices[i]);
            suf[i]=Math.max(suf[i+1],max-prices[i]);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int val1=pre[i];
            int val2=0;
            if(i<n-1)
            {
              val2=suf[i+1];  
            }
            count=Math.max(count,val1+val2);
}
        return count;
    }
}
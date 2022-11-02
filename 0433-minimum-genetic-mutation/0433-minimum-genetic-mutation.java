class Solution {
    public int minMutation(String start, String end, String[] bank) {
       int min=Integer.MAX_VALUE;
        int n=bank.length;
        boolean dp[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
   if(valid(start,bank[i]))
   {
       dp[i]=true;
       int val=helper(bank[i],end,dp,bank);
       if(val!=Integer.MAX_VALUE)
       {
           min=Math.min(min,val+1);
       }
       dp[i]=false;
   }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    int helper(String start,String end,boolean dp[],String bank[])
    {
        int n=dp.length;
        if(start.equals(end))
        {return 0;}
        int min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++)
        {
   if(!dp[i]&&valid(start,bank[i]))
   {
       dp[i]=true;
       int val=helper(bank[i],end,dp,bank);
       if(val!=Integer.MAX_VALUE)
       {
           min=Math.min(min,val+1);
       }
       dp[i]=false;
   }
        }
        return min;
    }
boolean valid(String s,String t)
{
   int cnt=0;
    int i=0;
    int j=0;
    while(i<s.length())
    {
        if(s.charAt(i)!=t.charAt(j))
        {cnt++;}
        i++;
        j++;
    }
    return cnt<2;
}
}
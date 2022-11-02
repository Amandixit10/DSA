class Solution {
    Integer dp[][];
    public int minMutation(String start, String end, String[] bank) {
       int min=Integer.MAX_VALUE;
        int n=bank.length;
        dp=new Integer[n+1][n+1];
        boolean fill[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
   if(valid(start,bank[i]))
   {
       fill[i]=true;
       int val=helper(bank[i],end,fill,bank,0,i+1);
       if(val!=Integer.MAX_VALUE)
       {
           min=Math.min(min,val+1);
       }
       fill[i]=false;
   }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    int helper(String start,String end,boolean fill[],String bank[],int prev,int curr)
    {
        int n=fill.length;
        if(start.equals(end))
        {return 0;}
        if(dp[prev][curr]!=null)
        {return dp[prev][curr];}
        int min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++)
        {
   if(!fill[i]&&valid(start,bank[i]))
   {
       fill[i]=true;
       int val=helper(bank[i],end,fill,bank,curr,i);
       if(val!=Integer.MAX_VALUE)
       {
           min=Math.min(min,val+1);
       }
       fill[i]=false;
   }
        }
        dp[prev][curr]=min;
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
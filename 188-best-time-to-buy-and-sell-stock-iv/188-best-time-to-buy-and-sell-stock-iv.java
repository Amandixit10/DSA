/*class Solution {
    Integer dp[][][][];
    public int maxProfit(int k, int[] prices) {
        if(prices.length==0||k==0)
        {return 0;}
        int n=prices.length;
        dp=new Integer[n][2][k+1][1001];
return Math.max(helper(k,prices,1,1,prices[0]),helper(k,prices,0,1,0));
    }
    int helper(int k,int prices[],int state,int idx,int prev)
    {
        if(k<=0||idx>=prices.length)
        {
            return 0;
        }
        int ans=0;
        if(dp[idx][state][k][prev]!=null)
        {return dp[idx][state][k][prev];}
        if(state==1)
        {
            int val=0;
            if(prices[idx]>=prev)
            {
              val=prices[idx]-prev;
              int a=val+helper(k-1,prices,1,idx+1,prices[idx]);
              int b=val+helper(k-1,prices,0,idx+1,0);
              ans=Math.max(a,b);
            }
            int c=helper(k,prices,state,idx+1,prev);
            ans=Math.max(ans,c);
        }
        else{
            int a=helper(k,prices,1,idx+1,prices[idx]);
            int b=helper(k,prices,0,idx+1,0);
            ans=Math.max(ans,Math.max(a,b));
        }
        dp[idx][state][k][prev]=ans;
        return ans;
    }
}
*/

class Solution {
public int maxProfit(int k, int[] prices) {
int n=prices.length;
    int dp[][]=new int[n][k+1];
    for(int i=n-2;i>=0;i--)
    { 
      for(int j=1;j<=k;j++)
      {
          dp[i][j]=dp[i+1][j];
         for(int l=i;l<n;l++)
         {
             if(prices[l]>=prices[i])
             {dp[i][j]=Math.max(dp[i][j],prices[l]-prices[i]+dp[l][j-1]);}
         }
      }
    }
    int max=0;
    for(int i[]:dp)
    {
        for(int j:i)
        {
            max=Math.max(max,j);
        }
    }
    return max;
}
}

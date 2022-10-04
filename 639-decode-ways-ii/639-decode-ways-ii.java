
// if curr char != * then if curr char == 0 then there are no ways. else there are curr char+1 no of ways. if curr char + curr char+1 <=26 then there are curr char+2 ways.

class Solution {
    int mod=1000000007;
    public int numDecodings(String s) {
        int n=s.length();
     long dp[]=new long[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch=='*')
            {
                dp[i]=(dp[i]+(9*dp[i+1])%mod)%mod;
                if(i+2<=n)
                {
                  if(s.charAt(i+1)=='*')
                  {
                      dp[i]=(dp[i]+(15*dp[i+2])%mod)%mod;
                  }
else{
    dp[i]=(dp[i]+dp[i+2])%mod;
    if(s.charAt(i+1)-'0'<=6)
    {
        dp[i]=(dp[i]+dp[i+2])%mod;
    }
}
                }
            }
            else if(ch=='0')
            {continue;}
            else{
                dp[i]=(dp[i]+dp[i+1])%mod;
                if(i+2<=n&&ch-'0'>0&&ch-'0'<3)
                {
                  if(s.charAt(i+1)=='*')
                  {
                     if(ch=='1')
                     {
                         dp[i]=(dp[i]+(9*dp[i+2])%mod)%mod;
                     }
                      else{
                          dp[i]=(dp[i]+(6*dp[i+2])%mod)%mod;
                      }
                  }
                    else{
                     if(ch=='1')
                     {
                         dp[i]=(dp[i]+dp[i+2])%mod;
                     }
                      else{
                          if(s.charAt(i+1)-'0'<=6)
                          dp[i]=(dp[i]+dp[i+2])%mod;
                      }
                    }
                    
                }
            }
        }
        return (int)dp[0];
    }
}
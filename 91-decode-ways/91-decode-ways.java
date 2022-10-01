class Solution {
Integer dp[];
    public int numDecodings(String s) {
        dp=new Integer[s.length()];
          int ans=helper(0,s);
        return ans;
    }
  int helper(int idx,String s)
    {
        if(idx>=s.length())
        {
            return 1;
        }
        if(dp[idx]!=null)
        {return dp[idx];}
        int cnt=0;
        if(s.charAt(idx)=='0')
        {
            return 0;
        }
   cnt+=helper(idx+1,s);
      if(idx+1<s.length())
      {
      if(s.charAt(idx)!='0')
      {
          int val=Integer.parseInt(s.substring(idx,idx+2));
          if(val>=1&&val<=26)
          {
         cnt+=helper(idx+2,s);
          }
      }
      }
        dp[idx]=cnt;
        return cnt;
    }
}
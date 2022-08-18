class Solution {
    Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String i:wordDict)
        {
            set.add(i);
        }
        dp=new Boolean[s.length()];
return helper(s,set,0);
        }
boolean helper(String s,HashSet<String> set,int idx)
{
    if(idx==s.length())
    {return true;}
    if(dp[idx]!=null)
    {return dp[idx];}
    int n=s.length();
    boolean ans=false;
    for(int i=idx;i<=n;i++)
    {
        if(set.contains(s.substring(idx,i)))
        {
         ans|=helper(s,set,i);   
        }
    }
    dp[idx]=ans;
return ans;
}
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String i:wordDict)
        {
            set.add(i);
        }
        boolean dp[]=new boolean[s.length()+1];
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                if(set.contains(s.substring(i,j)))
                {
                    dp[i]|=dp[j];
                }
            }
        }
        return dp[0];
    }
}
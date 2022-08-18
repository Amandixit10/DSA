class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> set=new HashSet<>();
        for(String i: words)
        {
            set.add(i);
        }
        helper(words,set);
        return list;
    }
    List<String> list=new ArrayList<>();
    void helper(String words[],HashSet<String> set)
    {
        for(String i:words)
        {
            if(isValid(0,i,set,new Boolean[i.length()]))
            {list.add(i);}
        }
    }
    boolean isValid(int idx,String s,HashSet<String> set,Boolean dp[])
    {
        if(idx>=s.length())
        {return true;}
        if(dp[idx]!=null)
        {return dp[idx];}
        boolean ans=false;
        for(int i=idx+1;i<=s.length();i++)
        {
            if(i-idx<s.length()&&set.contains(s.substring(idx,i)))
            {
                ans|=isValid(i,s,set,dp);
            }
            if(ans)
            {
                dp[idx]=true;
                return true;}
        }
        dp[idx]=false;
        return false;
    }
}
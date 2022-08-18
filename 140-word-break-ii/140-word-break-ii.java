class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String i:wordDict)
        {
            set.add(i);
        }
        helper(0,set,s,"",s.length());
        return ans;
    }
    List<String> ans=new ArrayList<>();
    void helper(int idx,HashSet<String> set,String s,String asf,int n)
    {
        if(idx>=n)
        {ans.add(asf);}
        for(int i=idx+1;i<=n;i++)
        {
            if(set.contains(s.substring(idx,i)))
            {
                helper(i,set,s,asf+(idx==0?"":" ")+s.substring(idx,i),n);
            }
        }
    }
}
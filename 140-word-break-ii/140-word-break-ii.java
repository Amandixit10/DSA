class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String i:wordDict)
        {
            set.add(i);
        }
        return helper(0,set,s,s.length());
    }
    HashMap<Integer,List<String>> map=new HashMap<>();
    List<String> ans=new ArrayList<>();
     List<String> helper(int idx,HashSet<String> set,String s,int n)
    {
         List<String> list=new ArrayList<>();
        if(idx>=n)
        {list.add("");
        return list;}
         if(map.containsKey(idx))
         {return map.get(idx);}
        for(int i=idx+1;i<=n;i++)
        {
            if(set.contains(s.substring(idx,i)))
            {
                List<String> x=helper(i,set,s,n);
                for(String j:x)
                {
                if(j=="")
                {list.add(s.substring(idx,i)+j);}
                    else{
                        list.add(s.substring(idx,i)+" "+j);
                    }
                }
            }
        }
         map.put(idx,list);
         return list;
    }
}
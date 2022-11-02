class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set=new HashSet<>();
        for(String i:bank)
        {
            set.add(i);
        }
        HashSet<String> seen=new HashSet<>();
        ArrayDeque<String> q=new ArrayDeque<>();
        q.add(start);
        seen.add(start);
        int level=0;
        while(q.size()>0)
        {
            int size=q.size();
            while(size-->0)
            {
            String s=q.remove();
            if(s.equals(end))
            {return level;}
                for(int i=0;i<s.length();i++)
                {
                    for(char ch:new char[]{'A','C','G','T'})
                    {
                        String t=s.substring(0,i)+(ch+"")+s.substring(i+1);
                        if(!seen.contains(t)&&set.contains(t))
                        {
                            q.add(t);
                            seen.add(t);
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
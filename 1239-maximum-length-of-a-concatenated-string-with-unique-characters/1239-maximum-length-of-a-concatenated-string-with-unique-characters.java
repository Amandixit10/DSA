class Solution {
    public int maxLength(List<String> arr) {
    List<String> list=new ArrayList<>();
        for(String i:arr)
        {
             int x[]=new int[26];
            int f=0;
            for(int j=0;j<i.length();j++)
            {
                char ch=i.charAt(j);
                if(x[ch-'a']>0)
                {
                    f=1;
                    break;
                }
    x[ch-'a']++;
            }
            if(f==0)
            {
                list.add(i);
            }
        }
        if(list.size()==0)
        {return 0;}
        int max=0;
            int ar[]=new int[26];
            String s=list.get(0);
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                ar[ch-'a']++;
            }
            int val1=s.length()+helper(1,ar,list);
          for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                ar[ch-'a']--;
            }
        int val2=helper(1,ar,list);
        return Math.max(val1,val2);
        }
    int helper(int idx,int ar[],List<String> list)
    {
        if(idx>=list.size())
        {
            return 0;}
    String s=list.get(idx);
        int val1=0;
        if(valid(s,ar))
        {
        
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                ar[ch-'a']++;
            }
           val1=s.length()+helper(idx+1,ar,list);
          for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                ar[ch-'a']--;
            }
        }
        int val2=helper(idx+1,ar,list);
        return Math.max(val1,val2);    
    }
    boolean valid(String s,int ar[])
    {
        for(char ch:s.toCharArray())
        {
            if(ar[ch-'a']!=0)
            {
                return false;}
        }
        return true;
    }
    }
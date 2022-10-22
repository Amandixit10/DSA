class Solution {
    public String minWindow(String s, String t) {
    int n=s.length();
        int m=t.length();
        int hi=n+1;
        int lo=-1;
HashMap<Character,Integer> a=new HashMap<>();
        for(char ch:t.toCharArray())
        {
            a.put(ch,a.getOrDefault(ch,0)+1);
        }
        String ans="";
        while(hi-lo>1)
        {
        int mid=lo+(hi-lo)/2;
        String str=valid(s,a,mid);
            if(str.length()>0)
            {
                ans=str;
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
    return ans;
    }
    String valid(String s,HashMap<Character,Integer> a,int len)
    {
        HashMap<Character,Integer> b=new HashMap<>();
       for(int i=len-1;i<s.length();i++)
       {
           if(i>=len)
           {
               char ch=s.charAt(i-len);
               if(b.containsKey(ch))
               {
               b.put(ch,b.getOrDefault(ch,0)-1);
                   if(b.get(ch)<=0)
                   {b.remove(ch);}
           }
           }
           if(i>=len)
           {
               char ch=s.charAt(i);
               b.put(ch,b.getOrDefault(ch,0)+1);
           }
           else{
           for(int j=i-len+1;j<=i;j++)
           {
               char ch=s.charAt(j);
           b.put(ch,b.getOrDefault(ch,0)+1); 
           }
           }
           int f=0;
for(char ch:a.keySet())
{
    if(!b.containsKey(ch)||b.get(ch)<a.get(ch))
    {f=1;
    break;}
}
           if(f==0)
           {
               return s.substring((i-len)+1,i+1);
           }
       }
        return "";
    }
}
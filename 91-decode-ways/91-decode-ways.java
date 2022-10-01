class Solution {
    HashMap<String,Integer> map=new HashMap<>();
    public int numDecodings(String s) {
        if(s.length()<2)
        {
            if(s.length()==0)
            {return 1;}
            return s.charAt(0)!='0'?1:0;}
        if(map.containsKey(s))
        {return map.get(s);}
        int cnt=0;
        if(s.charAt(0)=='0')
        {
            return 0;
        }
   cnt+=numDecodings(s.substring(1));
      if(s.length()>1)
      {
      if(s.charAt(0)!='0')
      {
          int val=Integer.parseInt(s.substring(0,2));
          if(val>=1&&val<=26)
          {
         cnt+=numDecodings(s.substring(2));
          }
      }
      }
        map.put(s,cnt);
        return cnt;
    }
}
class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {return "1";}
    String str=countAndSay(n-1);
        int cnt=1;
        String ans="";
        for(int i=1;i<str.length();i++)
        {
         if(str.charAt(i)!=str.charAt(i-1))
         {
          ans+=((char)(cnt+'0')+"")+(str.charAt(i-1)+"");
             cnt=1;
         }
            else{
                cnt++;
            }
        }
         ans+=((char)(cnt+'0')+"")+(str.charAt(str.length()-1)+"");
        return ans;
    }
}
class Solution {
    int max=0;
    boolean tkn[];
    public int maxProduct(String s) {
        int n=s.length();
        tkn=new boolean[n];
        tkn[0]=true;
        helper(1,s,s.charAt(0)+"",0);
        tkn[0]=false;
        helper(1,s,"",0);
        return max;
    }
    String helper(int pos,String s,String asf,int mrk)
    {
        if(pos>=s.length())
        {
            if(valid(asf))
            {
                if(mrk==0)
                {
             int a=asf.length();
                int b=helper(0,s,"",1).length();
                max=Math.max(max,a*b);
                }
                return asf;
            }
            return "";
        }
        String a="";
        if(!tkn[pos])
        {
        tkn[pos]=true;
        a=helper(pos+1,s,asf+s.charAt(pos),mrk);
        tkn[pos]=false;
        }
        String b=helper(pos+1,s,asf,mrk);
        return a.length()>=b.length()?a:b;
    }
    boolean valid(String s)
    {
        int i=0;
        int j=s.length()-1;
    while(i<j)
    {
        if(s.charAt(i)!=s.charAt(j))
        {return false;}
        i++;
        j--;
    }
        return true;
    }
}
class Solution {
    Integer dp[][];
    public int longestIdealString(String s, int k) {
        dp=new Integer[s.length()][27];
        return help(s,k,-1,0);
    }
    int help(String s,int k ,int prev,int idx)
    {
        if(idx>=s.length())
        {return 0;}
        if(dp[idx][prev+1]!=null)
        {return dp[idx][prev+1];}
        char ch=s.charAt(idx);
        int num=ch-'a';
        int a=0;
        if(Math.abs(num-prev)<=k||prev==-1)
        {
         a=1+help(s,k,num,idx+1);   
        }
        a=Math.max(a,help(s,k,prev,idx+1));
        dp[idx][prev+1]=a;
        return dp[idx][prev+1];
    }
}
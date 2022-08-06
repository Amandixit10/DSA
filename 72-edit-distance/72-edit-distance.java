class Solution {
    Integer dp[][]=new Integer[501][501];
    public int minDistance(String s1, String s2)
    {
        return help(s1,s2,0,0);
    }
    public int help(String s1, String s2,int i,int j) {
        int ans=0;
        int n=s1.length();
        int m=s2.length();
        if(s1.equals(s2))
        {return 0;}
        if(n==0||m==0)
        {
            return Math.max(n,m);
        }
        if(dp[i][j]!=null)
        {return dp[i][j];}
        if(s1.charAt(0)!=s2.charAt(0))
        {
            int a=1+help(s1.substring(1),s2,i+1,j); // delete
            int b=1+help(s1.substring(1),s2.substring(1),i+1,j+1);  // replace
            int c=1+help(s1,s2.substring(1),i,j+1);  // insert
            ans=Math.min(a,b);
            ans=Math.min(ans,c);
            //System.out.println(s1+" "+s2+" "+a+" "+b+" "+c);
        }
        else{
           ans=help(s1.substring(1),s2.substring(1),i+1,j+1); 
          //  System.out.println(s1+" "+s2+" "+ans);
        }
        dp[i][j]=ans;
        return ans;
    }
}
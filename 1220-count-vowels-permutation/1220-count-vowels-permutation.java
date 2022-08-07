class Solution {
    int mod=1000000007;
     HashSet<Integer> set;
    Integer dp[][];
    public int countVowelPermutation(int n) {
        dp=new Integer[n+1][5];
       set=new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        int count=0;
        for(int i:set)
        {
            count=(count+help(n-1,i))%mod;
        }
        return count;
    }
    int help(int n,int x)
    {
        if(n<=0)
        {return 1;}
        if(dp[n][x]!=null)
        {return dp[n][x];}
        int count=0;
        if(x==0)
        {
          count=(count+help(n-1,1))%mod;  
        }
        else if(x==1)
        {
            count=(count+help(n-1,0))%mod; 
            count=(count+help(n-1,2))%mod; 
        }
        else if(x==2)
        {
          for(int i:set)
          {
              if(i==2)
              {continue;}
              count=(count+help(n-1,i))%mod; 
          }
        }
        else if(x==3)
        {
              count=(count+help(n-1,2))%mod;   
              count=(count+help(n-1,4))%mod;
        }
        else{
              count=(count+help(n-1,0))%mod; 
          }
        dp[n][x]=count;
        return count;
    }
}
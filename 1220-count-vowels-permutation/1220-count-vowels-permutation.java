class Solution {
    int mod=1000000007;
     HashSet<Character> set;
    Integer dp[][];
    public int countVowelPermutation(int n) {
        dp=new Integer[n+1][26];
       set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        for(char i:set)
        {
            count=(count+help(n-1,i))%mod;
        }
        return count;
    }
    int help(int n,char ch)
    {
        if(n<=0)
        {return 1;}
        if(dp[n][ch-'a']!=null)
        {return dp[n][ch-'a'];}
        int count=0;
        if(ch=='a')
        {
          count=(count+help(n-1,'e'))%mod;  
        }
        else if(ch=='e')
        {
            count=(count+help(n-1,'a'))%mod; 
            count=(count+help(n-1,'i'))%mod; 
        }
        else if(ch=='i')
        {
          for(char i:set)
          {
              if(i=='i')
              {continue;}
              count=(count+help(n-1,i))%mod; 
          }
        }
        else if(ch=='o')
        {
              count=(count+help(n-1,'i'))%mod;   
              count=(count+help(n-1,'u'))%mod;
        }
        else{
              count=(count+help(n-1,'a'))%mod; 
          }
        dp[n][ch-'a']=count;
        return count;
    }
}
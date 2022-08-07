class Solution {
    public int countVowelPermutation(int n) {
        int mod=1000000007;
        int dp[][]=new int[n+1][5];
        for(int i=0;i<5;i++)
        {
            dp[n][i]=1;
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<5;j++)
            {
                if(j==0)
                {
                    dp[i][j]=dp[i+1][1];
                }
                else if(j==1)
                {
                    dp[i][j]=(((dp[i][j]+dp[i+1][0])%mod)+dp[i+1][2])%mod;
                }
                else if(j==2)
                {
                    dp[i][j]=(((dp[i+1][0]+dp[i+1][1])%mod)+((dp[i+1][3]+dp[i+1][4])%mod))%mod;
                }
                else if(j==3)
                {
                    dp[i][j]=(dp[i+1][2]+dp[i+1][4])%mod;
                }
                else{
                    dp[i][j]=dp[i+1][0];
                }
            }
        }
            int count=0;
            for(int i=0;i<5;i++)
            {
                count=(count+dp[1][i])%mod;
            }
        /*for(int i[]:dp)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
            return count;
        }
    }

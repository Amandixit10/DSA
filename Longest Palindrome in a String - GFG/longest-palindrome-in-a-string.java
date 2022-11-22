//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        int n=S.length();
        int dp[][]=new int[n][n];
        int mi=0;
        int mj=0;
        for(int g=0;g<n;g++)
        {
            for(int j=g,i=0;j<n;j++,i++)
            {
                if(i==j)
                {
                 dp[i][j]=1;   
                }
                else if((j-i)==1)
                {
                    if(S.charAt(i)==S.charAt(j))
                    {
                        dp[i][j]=2;
                    }
                }
                else{
                    if(S.charAt(i)==S.charAt(j))
                    {
                        dp[i][j]=dp[i+1][j-1]==0?0:dp[i+1][j-1]+2;
                    }
                }
                if(dp[i][j]>0&&mj-mi<j-i)
                {
                    mj=j;
                    mi=i;
                }
            }
        }
        return S.substring(mi,mj+1);
    }
}
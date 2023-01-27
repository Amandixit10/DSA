//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        int n=str.length();
if(n==1)
{
    if(str.charAt(0)=='0')
    {
        return 0;
    }
    return 1;
}
        long dp[]=new long[n+1];
        dp[n]=1;
        if(str.charAt(n-1)!='0')
        {
        dp[n-1]=1L;
        }
        for(int i=n-2;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch=='0')
            {
            continue;    
            }
            dp[i]=dp[i+1];
            int num=Integer.parseInt(str.substring(i,i+2));
            if(num<=26)
            {
                dp[i]=(dp[i]+dp[i+2])%1000000007;
            }
        }
        return (int)dp[0];
    }
}
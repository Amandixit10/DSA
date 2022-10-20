//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] cost = new int[N];
            
            for(int i=0 ; i<N ; i++)
                cost[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minCostClimbingStairs(cost,N));
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    static Integer dp[];
    static int minCostClimbingStairs(int[] cost , int N) {
        dp=new Integer[N];
        int val1=Math.min(helper(2,cost,N),helper(1,cost,N))+cost[0];
        int val2=Math.min(helper(3,cost,N),helper(2,cost,N))+cost[1];
        return Math.min(val1,val2);
    }
    static int helper(int idx,int cost[],int n)
    {
        if(idx>=n)
        {return 0;}
        if(dp[idx]!=null)
        {
            return dp[idx];
        }
        int val1=helper(idx+1,cost,n)+cost[idx];
        int val2=helper(idx+2,cost,n)+cost[idx];
    dp[idx]=Math.min(val1,val2);
        return dp[idx];
    }
}
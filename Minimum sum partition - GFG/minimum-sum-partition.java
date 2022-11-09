//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
Integer dp[][];
	public int minDifference(int arr[], int n) 
	{ 
	  int sum=0;
	  for(int i:arr)
	  {
	      sum+=i;
	  }
	  dp=new Integer[n][sum+1];
	  int a=helper(1,arr[0],arr,sum);
	  int b=helper(1,0,arr,sum);
	  return Math.min(a,b);
	} 
	int helper(int idx,int sum,int arr[],int total)
	{
	    if(idx>=arr.length)
	    {
	        return Math.abs((2*sum)-total);
	    }
	    if(dp[idx][sum]!=null)
	    {
	        return dp[idx][sum];
	    }
	    int a=helper(idx+1,sum+arr[idx],arr,total);
	    int b=helper(idx+1,sum,arr,total);
	    return dp[idx][sum]=Math.min(a,b);
	}
}

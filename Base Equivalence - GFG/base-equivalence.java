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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int m = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.baseEquiv(n,m));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    String baseEquiv(int n, int m)
    {
        int lo=1;
        int hi=33;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
int len=find(n,mid);
if(len==m)
{
    return "Yes";
}
if(len>m)
{
    lo=mid;
}
else{
    hi=mid;
}
        }
        return "No";
    }
    int find(int n,int base)
    {
        int len=0;
        while(n>0)
        {
            n/=base;
            len++;
        }
        return len;
    }
}
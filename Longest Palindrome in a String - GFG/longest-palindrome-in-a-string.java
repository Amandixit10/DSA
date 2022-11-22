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
        int start=0;
        int end=0;
        for(int i=0;i<S.length();i++)
        {
            int x=expand(S,i,i);
            int y=expand(S,i,i+1);
            int len=Math.max(x,y);
            if(len>(end-start+1))
            {
                start=i-(len-1)/2;
                end=i+(len/2);
            }
        }
        return S.substring(start,end+1);
    }
    static int expand(String s,int l,int r)
    {
        int n=s.length();
        while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        //System.out.println(l+" "+r);
        return r-l-1;
    }
}
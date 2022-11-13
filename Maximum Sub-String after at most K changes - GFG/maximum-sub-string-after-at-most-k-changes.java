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
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int t)
    {
        int max=1;
    for(int k=0;k<26;k++)
    {
        char ch=(char)(k+'A');
        int i=0;
        int j=0;
        int len=0;
        int rep=0;
        while(j<s.length())
        {
          if(s.charAt(j)!=ch)
          {
              rep+=1;
          }
          while(rep>t)
          {
              if(s.charAt(i)!=ch)
              {
              rep-=1;
              }
              i++;
          }
          len=Math.max(len,j-i+1);
          j++;
        }
        
        max=Math.max(max,len);
    }
    return max;
    }
}
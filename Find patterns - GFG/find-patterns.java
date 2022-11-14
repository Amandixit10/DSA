//{ Driver Code Starts
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
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        int cnt=0;
        boolean ar[]=new boolean[S.length()];
       for(int i=0;i<S.length();i++)
       {
           if(S.charAt(i)==W.charAt(0))
           {
               int idx=0;
               for(int j=i;idx<W.length()&&j<S.length();j++)
               {
                   if(!ar[j]&&S.charAt(j)==W.charAt(idx))
                   {
                       ar[j]=true;
                       idx++;
                   }
               }
               if(idx>=W.length())
               {
                   cnt++;
               }
           }
       }
       return cnt;
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        int ar[]=new int[32];
        int idx=0;
        int val=0;
        while(b>0)
        {
            val+=b%2;
            b/=2;
        }
        b=val;
        int ans=0;
        while(a>0)
        {
            ar[idx]=a%2;
            a/=2;
            idx++;
        }
    idx-=1;
      for(int i=idx;i>=0&b>0;i--)
      {
        if(ar[i]==1)
        {
        ans+=1<<i;
        b-=1;
        }
      }
      if(b>0)
      {
          for(int i=0;i<32&&b>0;i++)
          {
              if(ar[i]==0)
              {
                  ans+=1<<i;
                  b-=1;
              }
          }
      }
      return ans;
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long max;;
    static long jumpingNums(long X) {
        max=Long.MIN_VALUE;
        for(int i=1;i<10;i++)
        {
         if(i>0)
         {
             helper(i-1,X,i+"");
         }
         if(i<9)
         {
             helper(i+1,X,i+"");
         }
        }
        return max;
    }
    static void helper(int idx,long x,String num)
    {
        if(Long.parseLong(num)>x)
        {
           return;
        }
     long n=Long.parseLong(num);
     max=Math.max(max,n);
     //System.out.println(n);
     if(idx>0)
         {
             helper(idx-1,x,num+(idx+""));
         }
         if(idx<9)
         {
             helper(idx+1,x,num+(idx+""));
         }
    }
};
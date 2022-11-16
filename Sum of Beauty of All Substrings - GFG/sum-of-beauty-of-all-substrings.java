//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
    int sum=0;
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
       int ar[]=new int[26];
       for(int k=i;k<=j;k++)
       {
           char ch=s.charAt(k);
           ar[ch-'a']++;
       }
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int k:ar)
       {
           if(k!=0)
           {
               min=Math.min(k,min);
               max=Math.max(k,max);
           }
       }
       sum+=max-min;
        }
    }
    return sum;
    }
}
        

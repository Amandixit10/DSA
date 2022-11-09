//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int idx=-1;
        int cnt=1;
        for(int i=1;i<size;i++)
        {
         if(a[i]!=a[i-1])
         {
          if(cnt>size/2)
          {
              idx=a[i-1];
          }
          cnt=1;
         }
         else{
             cnt++;
         }
        }
        if(cnt>size/2)
          {
              idx=a[size-1];
          }
        return idx;
    }
}
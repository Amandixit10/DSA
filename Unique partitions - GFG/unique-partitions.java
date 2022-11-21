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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n;i>0;i--)
        {
         list.add(i);
         helper(i,list,i,n);
         list.remove(list.size()-1);
        }
        return ans;
    }
    void helper(int sum,ArrayList<Integer> list,int idx,int val)
    {
        if(sum>=val)
        {
            if(sum==val)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=idx;i>0;i--)
        {
            list.add(i);
            helper(sum+i,list,i,val);
            list.remove(list.size()-1);
        }
    }
}
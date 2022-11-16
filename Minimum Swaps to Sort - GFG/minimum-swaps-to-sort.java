//{ Driver Code Starts
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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n=nums.length;
        int ar[]=new int[n];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         map.put(nums[i],i); 
         ar[i]=nums[i];
       }
         Arrays.sort(ar);
         int ans=0;
       for(int i=0;i<n;i++)
       {
           if(ar[i]!=nums[i])
           {
               int x=map.get(ar[i]);
               int t=nums[i];
               nums[i]=ar[i];
               nums[x]=t;
               ans++;
               map.put(ar[i],i);
               map.put(t,x);
           }
       }
       return ans;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
long max=Long.MIN_VALUE;
    long maxProduct(int[] arr, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        for(int i=0;i<n;i++)
        {
        if(arr[i]==0)
        {
            list.add(i);
        }
        }
        for(int i=0;i<list.size()-1;i++)
        {
            max=Math.max(max,helper(list.get(i)+1,list.get(i+1)-1,arr));
        }
        max=Math.max(max,helper(list.get(list.size()-1)+1,n-1,arr));
        return list.size()==1?max:Math.max(max,0);
    }
    long helper(int l,int r,int ar[])
    {
        TreeSet<Long> set=new TreeSet<>();
        long prod=1;
        int n=ar.length;
        for(int i=l;i<=r;i++)
        {
            prod*=ar[i];
            if(prod<0)
            {
                if(set.size()==0)
                {
                    max=Math.max(max,prod);
                }
                else{
                    max=Math.max(max,(prod*-1)/set.first());
                }
                set.add(prod*-1);
            }
            else{
                max=Math.max(max,prod);
            }
        }
        return max;
    }
}
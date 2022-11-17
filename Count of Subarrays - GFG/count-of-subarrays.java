//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            long ans = new Solution().countSubarray(arr, n, k);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    long countSubarray(int arr[], int n, int k) {
long ans=0;
List<Integer> list=new ArrayList<>();
for(int i=0;i<n;i++)
{
    if(arr[i]>k)
    {
        list.add(i);
    }
}
if(list.size()==0)
{
    return 0;
}
for(int i=0;i<list.size()-1;i++)
{
    long a=list.get(i)+1;
    long b=list.get(i+1)-list.get(i);
    ans+=(a*b);
}
long a=list.get(list.size()-1)+1;
    long b=n-list.get(list.size()-1);
    ans+=(a*b);
return ans;
    }
}
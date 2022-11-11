//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static HashSet<Integer> set=new HashSet<>();
    static String isSumOfTwo(int N){
       boolean ar[]=new boolean[N+1];
        for(int i=2;i*i<=N;i++)
        {
            if(!ar[i])
            {
                set.add(i);
                if(set.contains(N-i))
                {
                    return "Yes";
                }
           for(int j=i*i;j<=N;j+=i)
           {
               ar[j]=true;
           }
            }
        }
        for(int i=2;i<=N;i++)
        {
            if(!ar[i])
            {
                if(set.contains(N-i))
                {
               return "Yes"; 
                }
                set.add(i);
            }
            
        }
        return "No";
    }
}
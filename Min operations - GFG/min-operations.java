//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a;
            a = Integer.parseInt(br.readLine());
            
            
            int b;
            b = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.solve(a, b);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int a, int b) {
        return a==b?0:((a&b)==Math.min(a,b)?1:2);
    }
}
        

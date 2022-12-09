//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends


class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int n, int m)
    {
        long total=(long)m*(long)n;
        total*=(total-1);
        if(n>=2&&m>=1)
        {
            total-=4*((long)(n-2)*(long)(m-1));
        }
        if(n>=1&&m>=3)
        {
        total-=4*((long)(m-2)*(long)(n-1));
        }
        return total%1000000007;
    }
}
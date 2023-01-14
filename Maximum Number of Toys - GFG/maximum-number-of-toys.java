//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    } 

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for(int i = 0; i < N; i++) A[i] = sc.nextInt();
            int Q = sc.nextInt();
            ArrayList<Integer> Queries[] = new ArrayList[Q];
            for(int i = 0; i < Q; i++){
                Queries[i] = new ArrayList<>();
                int x = sc.nextInt(), y = sc.nextInt();
                Queries[i].add(x);
                Queries[i].add(y);
                for(int j = 0; j < Queries[i].get(1); j++){
                    x = sc.nextInt();
                    Queries[i].add(x);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.maximumToys(N, A, Q, Queries);
            for(int x : ans)
                out.print(x + " ");
            out.print("\n");
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]){
        int ar[][]=new int[N][2];
        for(int i=0;i<N;i++)
        {
            ar[i][0]=A[i];
            ar[i][1]=i;
        }
        Arrays.sort(ar,(a,b)->(a[0]-b[0]));
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<Q;i++)
        {
        HashSet<Integer> set=new HashSet<>();
        int idx=0;
        for(int j=2;j<Queries[i].size();j++)
        {
            set.add(Queries[i].get(j));
        }
        list.add(helper(ar,set,Queries[i].get(0)));
        }
       return list; 
    }
    static int helper(int ar[][],HashSet<Integer> set,int total)
    {
       // System.out.println(ar.length+" "+val.length+" "+total);
        int sum=0;
        int i=0;
        int ans=0;
        while(sum<total&&i<ar.length)
        {
        if(!set.contains(ar[i][1]+1))
        {
          //System.out.print(ar[i][0]+" ");
            sum+=ar[i][0];
            ans++;
        }
        i++;
        }
        //System.out.println();
        return sum>total?ans-1:ans;
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
int ar[]=new int[str.length()];
for(int i=0;i<str.length();i++)
{
 if(str.charAt(i)-'a'<0)
 {
     ar[i]++;
 }

}
char ch[]=str.toCharArray();
Arrays.sort(ch);
StringBuilder s=new StringBuilder();
int i=0;
int j=0;
int idx=0;
while(idx<ar.length)
{
    if(ar[idx]==0)
    {
       while(i<ar.length && ch[i]-'a'<0)
       {
           i++;
       }
       s.append(ch[i]);
       i++;
    }
    else{
         while(j<ar.length&&ch[j]-'a'>=0)
       {
           j++;
       }
       s.append(ch[j]);
       j++;
    }
    idx++;
}
return s.toString();
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends
class Solution {
    Integer dp[][]=new Integer[501][501];
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n==0||m==0)
        {
            return Math.max(n,m);
        }
        if(dp[n][m]!=null)
        {return dp[n][m];}
        if(word1.charAt(0)==word2.charAt(0))
        {return minDistance(word1.substring(1),word2.substring(1));}
        int add=1+minDistance(word1,word2.substring(1));
        int del=1+minDistance(word1.substring(1),word2);
        int rep=1+minDistance(word1.substring(1),word2.substring(1));
        dp[n][m]=Math.min(add,Math.min(rep,del));
        return dp[n][m];
    }
}
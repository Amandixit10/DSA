class Solution {
    public int longestIdealString(String s, int k) {
        int dp[]=new int[26];
        int n=s.length();
        int omax=0;
        for(int i=0;i<n;i++)
        {
        int val=s.charAt(i)-'a';
            int max=0;
            for(int j=0;j<26;j++)
            { 
                if(Math.abs(j-val)<=k)
                {
                    max=Math.max(max,1+dp[j]);
                }
            }
            dp[val]=max;
            omax=Math.max(max,omax);
        }
        return omax;
    }
}
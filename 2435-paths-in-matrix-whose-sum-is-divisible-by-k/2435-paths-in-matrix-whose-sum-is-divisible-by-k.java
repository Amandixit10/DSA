class Solution {
    int mod=1000000007;
    Integer dp[][][];
    public int numberOfPaths(int[][] grid, int k) {
        dp=new Integer[grid.length][grid[0].length][51];
        return helper(0,0,grid,k,0);
    }
    int helper(int i,int j,int grid[][],int k,int sum)
    {
        if(i==grid.length-1&&j==grid[0].length-1)
        {
        sum=(sum+grid[i][j])%k;
            return sum==0?1:0;}
        if(i>=grid.length||j>=grid[0].length)
        {return 0;}
        if(dp[i][j][sum]!=null)
        {return dp[i][j][sum];}
       int val1= helper(i+1,j,grid,k,(sum+grid[i][j])%k);
        int val2=helper(i,j+1,grid,k,(sum+grid[i][j])%k);
        int ans=0;
        ans=(ans+val1)%mod;
        ans=(ans+val2)%mod;
        dp[i][j][sum]=ans;
        return ans;
    }
}
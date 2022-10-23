class Solution {
    public int numberOfBeams(String[] bank) {
        int m=bank[0].length();
        int n=bank.length;
        int ar[][]=new int[n][m];
        int i=0;
        int prev=0;
        int cnt=0;
        for(String k:bank)
        {
            int j=0;
            for(char ch:k.toCharArray())
            {
                ar[i][j]=(ch-'0');
                if(j>0)
                {
                    ar[i][j]+=ar[i][j-1];
                }
                j++;
            }
            if(ar[i][j-1]!=0)
            {
                cnt+=prev*ar[i][j-1];
                prev=ar[i][j-1];
            }
            i++;
        }
        return cnt;
    }
}
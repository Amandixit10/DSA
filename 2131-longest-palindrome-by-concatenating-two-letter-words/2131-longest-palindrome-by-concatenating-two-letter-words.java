class Solution {
    public int longestPalindrome(String[] words) {
        int ar[][]=new int[26][26];
        for(String i:words)
        {
            int a=i.charAt(0)-'a';
            int b=i.charAt(1)-'a';
            ar[a][b]++;
        }
        boolean mid=false;
        int cnt=0;
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<26;j++)
            {
                if(j<i)
                {continue;}
                if(i==j)
                {
                    if(ar[i][j]>0)
                    {
                        if(ar[i][j]%2!=0)
                        {
                           if(!mid)
                           {
                            cnt+=ar[i][j]*2;
                           mid=true;
                           }
                            else{
                                cnt+=(ar[i][j]-1)*2;
                            }
                        }
                        else{
                            cnt+=ar[i][j]*2;
                        }
                    }
                }
                else{
                   int val=Math.min(ar[i][j],ar[j][i])*2;
                    val*=2;
                    cnt+=val;
                }
            }
        }
        return cnt;
    }
}
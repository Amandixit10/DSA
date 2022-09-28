class Solution {
    public int longestSubsequence(String s, int k) {
    char ar[]=s.toCharArray();
        int n=ar.length;
        int cnt=0;
        for(char i:ar)
        {
            if(i=='0')
            {cnt++;}
        }
        int i=n-1;
        long sum=0;
        int x=0;
        int b=1;
        while(i>=0&&sum+b<=k)
        {
            if(ar[i]=='1')
            {
            sum+=b;
            }
            else{
                cnt--;
            }
            i--;
            x++;
            b*=2;
        }
        return x+cnt;
    }
}
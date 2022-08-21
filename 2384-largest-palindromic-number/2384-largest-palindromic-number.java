class Solution {
    public String largestPalindromic(String num) {
int dig[]=new int[10];
        for(int i=0;i<num.length();i++)
        {
int val=num.charAt(i)-'0';
        dig[val]++;
        }
        String ans="";
        int max=-1;
for(int i=9;i>=0;i--)
{
if(dig[i]%2!=0)
{
    max=Math.max(max,i);
}
    if(dig[i]>1)
    {
    for(int j=0;j<dig[i]/2;j++)
    {
        ans+=i+"";
    }
    }
}
        String app="";
        for(int i=ans.length()-1;i>=0;i--)
        {
            app+=ans.charAt(i)+"";
        }
        if(max!=-1)
        {ans+=max+"";}
        ans+=app;
        if(ans.charAt(0)=='0')
        {
            if(max==-1)
            {
            return 0+"";}
            return max+"";
        }
        return ans;
    }
}
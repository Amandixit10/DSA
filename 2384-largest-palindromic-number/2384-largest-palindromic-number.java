class Solution {
    public String largestPalindromic(String num) {
int dig[]=new int[10];
        for(int i=0;i<num.length();i++)
        {
int val=num.charAt(i)-'0';
        dig[val]++;
        }
        StringBuilder ans=new StringBuilder();
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
        ans.append(i+"");
    }
    }
}
        String pre=ans.toString();
        String app=ans.reverse().toString();
        if(max!=-1)
        {pre+=max+"";}
        pre+=app;
        if(pre.charAt(0)=='0')
        {
            if(max==-1)
            {
            return 0+"";}
            return max+"";
        }
        return pre;
    }
}
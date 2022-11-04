class Solution {
    public String replaceDigits(String s) {
        char ar[]=s.toCharArray();
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
            char ch=(char)(((ar[i-1]-'a')+(ar[i]-'0'))+'a');
            ar[i]=ch;
            }
            str.append(ar[i]);
        }
        return str.toString();
    }
}
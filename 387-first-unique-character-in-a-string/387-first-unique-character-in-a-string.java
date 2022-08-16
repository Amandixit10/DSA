class Solution {
    public int firstUniqChar(String s) {
    int ar[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=ch-'a';
            if(ar[x]!=0)
            {
                ar[x]=-1;
            }
            else{
       ar[x]=i+1;
            }
        }
        int min=s.length()+1;
    for(int i=0;i<26;i++)
    {
       if(ar[i]>0)
       {min=Math.min(min,ar[i]);}
    }
        return min>s.length()?-1:min-1;
    }
}
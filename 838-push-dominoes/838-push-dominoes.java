class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        char ar[]=new char[n+2];
        ar[0]='L';
        ar[n+1]='R';
        for(int i=1;i<n+1;i++)
        {
            ar[i]=dominoes.charAt(i-1);
        }
        int i=0;
        while(i<(n+2))
        {
            if(ar[i]=='.')
            {
                int prev=i;
             
                while(i<=(n+1)&&ar[i]=='.')
                {
                    i++;
                }
                if(ar[i]==ar[prev-1])
                {
                    while(prev<i)
                    {ar[prev]=ar[i];
                    prev++;}
                }
                else if(ar[prev-1]=='R'&&ar[i]=='L')
                {
                    int j=i-1;
                    while(prev<j)
                    {
                        ar[prev]='R';
                        ar[j]='L';
                        prev++;
                        j--;
                    }
                }
            }
            else{
                i++;
            }
        }
        
        StringBuilder ans=new StringBuilder();
        for(int j=1;j<=n;j++)
        {
            ans.append(ar[j]);
        }
        return ans.toString();
    }
}
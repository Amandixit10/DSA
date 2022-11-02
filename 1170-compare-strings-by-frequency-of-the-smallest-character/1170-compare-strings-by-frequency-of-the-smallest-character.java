class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n=queries.length;
        int m=words.length;
       int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=fill(queries[i]);
        }
        for(int i=0;i<m;i++)
        {
            b[i]=fill(words[i]);
        }
        Arrays.sort(b);
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=bs(b,a[i]);
        }
        return ans;
    }
    int bs(int ar[],int val)
    {
        int n=ar.length;
        int lo=-1;
        int hi=n;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(ar[mid]>val)
            {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
        return n-hi;
    }
    int fill(String s)
    {
    int n=s.length();
            int freq[]=new int[26];
            for(char ch:s.toCharArray())
            {
               freq[ch-'a']++;
            }
           for(int i:freq)
           {
if(i!=0)
{
   return i;
}
           }
        return 0;
        }
}
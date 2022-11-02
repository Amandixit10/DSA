class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n=queries.length;
        int m=words.length;
       int a[]=new int[n];
        int b[]=new int[m];
        fill(a,queries);
        fill(b,words);
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
    void fill(int ans[],String ar[])
    {
    int n=ar.length;
        for(int i=0;i<n;i++)
        {
            TreeMap<Character,Integer> map=new TreeMap<>();
            for(char ch:ar[i].toCharArray())
            {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            ans[i]=map.get(map.firstKey());
        }
    }
}
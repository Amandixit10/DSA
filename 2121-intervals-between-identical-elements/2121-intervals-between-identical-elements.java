class Solution {
    public long[] getDistances(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> cnt=new HashMap<>();
        int n=arr.length;
        long dp[]=new long[n];
        long x[]=new long[n];
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int val=cnt.get(arr[i]);
                dp[i]=val*(i-map.get(arr[i]))+dp[map.get(arr[i])];
            }
            map.put(arr[i],i);
            cnt.put(arr[i],cnt.getOrDefault(arr[i],0)+1);
        }
        map=new HashMap<>();
        cnt=new HashMap<>();
        for(int i=n-1;i>=0;i--)
        {
            if(map.containsKey(arr[i]))
            {
                int val=cnt.get(arr[i]);
            x[i]+=val*(map.get(arr[i])-i)+x[map.get(arr[i])];
            }
            map.put(arr[i],i);
            cnt.put(arr[i],cnt.getOrDefault(arr[i],0)+1);
            dp[i]+=x[i];
        }
        return dp;
    }
}
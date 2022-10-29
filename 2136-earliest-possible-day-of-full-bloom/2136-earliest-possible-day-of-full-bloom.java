class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=growTime.length;
        int ar[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            ar[i][0]=plantTime[i];
            ar[i][1]=growTime[i];
        }
        Arrays.sort(ar,(a,b)->(b[1]-a[1]));
        int time=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
         ans=Math.max(ans,time+ar[i][0]+ar[i][1]);
            time+=ar[i][0];
        }
        return ans;
    }
}
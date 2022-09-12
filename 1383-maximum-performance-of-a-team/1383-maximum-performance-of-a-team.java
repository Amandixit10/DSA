class Solution {
    int mod=1000000007;
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int ar[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            ar[i][0]=speed[i];
            ar[i][1]=efficiency[i];
        }
        Arrays.sort(ar,(a,b)->(b[1]==a[1])?(b[0]-a[0]):(b[1]-a[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
      long  max=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(pq.size()<k)
            {
                pq.add(ar[i][0]);
                sum=sum+ar[i][0];
            }
            else{
                if(pq.peek()<ar[i][0])
                {
                    sum-=pq.remove();
                    sum=sum+ar[i][0];
                    pq.add(ar[i][0]);
                }
            }
            long prod=sum*(long)ar[i][1];
            max=Math.max(max,prod);
        }
        return (int)(max%mod);
    }
}
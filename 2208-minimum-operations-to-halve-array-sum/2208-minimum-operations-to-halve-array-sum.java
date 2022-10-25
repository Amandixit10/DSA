class Solution {
    public int halveArray(int[] nums) {
       PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int i:nums)
        {
            pq.add((double)(i));
            sum+=i;
        }
        int cnt=0;
        double mid=sum/2;
        while(sum>mid)
        {
            double val=pq.remove();
            sum-=(val-(val/2));
            val-=val/2;
            pq.add(val);
            cnt++;
        }
        return cnt;
    }
}
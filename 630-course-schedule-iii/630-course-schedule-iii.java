class Solution {
    public int scheduleCourse(int[][] ar) {
        int n=ar.length;
        Arrays.sort(ar,(a,b)->(a[1]-b[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        int total=0;
        for(int i=0;i<n;i++)
        {
       int dur=ar[i][0];
            int end=ar[i][1];
           
            if(total+dur<=end)
            {
               pq.add(dur);
                total+=dur;
            }
            else if(pq.size()>0&&pq.peek()>dur)
            {
               
            total-=pq.remove();
                total+=dur;
                pq.add(dur);
            }
        }
        return pq.size();
    }
}
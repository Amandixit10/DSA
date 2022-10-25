class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i:piles)
        {pq.add(i);}
        int n=piles.length;
            while(k>0&&pq.peek()>1)
            {
            int val=pq.remove();
                val-=val/2;
                pq.add(val);
                k--;
            }
        int cnt=0;
        while(pq.size()>0)
        {
           cnt+=pq.remove();
        }
        return cnt;
    }
}
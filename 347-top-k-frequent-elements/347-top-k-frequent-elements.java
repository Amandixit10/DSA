class Solution {
    class pair{
        int val;
        int freq;
        pair(int val,int freq)
        {
            this.val=val;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(a.freq-b.freq));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(pq.size()<k)
            {
                pq.add(new pair(i,map.get(i)));
            }
            else{
                if(map.get(i)>map.get(pq.peek().val))
                {
                    pq.remove();
                    pq.add(new pair(i,map.get(i)));
                }
            }
        }
        int ans[]=new int[k];
        int i=0;
        while(pq.size()>0)
        {
            ans[i]=pq.remove().val;
            i++;
        }
        return ans;
    }
}
class Solution {
    class pair{
        String s;
        int val;
        pair(String s,int val)
        {
            this.s=s;
            this.val=val;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
     HashMap<String,Integer> map=new HashMap<>();
        for(String i:words)
        {map.put(i,map.getOrDefault(i,0)+1);}
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(a.val==b.val)?(b.s.compareTo(a.s)):(a.val-b.val));
        for(String i:map.keySet())
        {
            if(pq.size()<k)
            {
                pq.add(new pair(i,map.get(i)));
            }
            else if(pq.peek().val<map.get(i))
            {pq.remove();
            pq.add(new pair(i,map.get(i)));}
            else if(pq.peek().val==map.get(i))
            {
                if(pq.peek().s.compareTo(i)>0)
                {
                    pq.remove();
                    pq.add(new pair(i,map.get(i)));
                }
            }
        }
        List<String> list=new ArrayList<>();
        while(pq.size()>0)
        {
            list.add(pq.remove().s);
        }
        Collections.reverse(list);
        return list;
    }
}
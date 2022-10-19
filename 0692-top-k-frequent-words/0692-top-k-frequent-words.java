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
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(a.val==b.val)?(a.s.compareTo(b.s)):(b.val-a.val));
        for(String i:map.keySet())
        {
            pq.add(new pair(i,map.get(i)));
        }
        List<String> list=new ArrayList<>();
        int idx=0;
        while(idx<k)
        {
       list.add(pq.remove().s);
            idx++;
        }
        return list;
    }
}
class Solution {
    class pair{
        char ch;
        int freq;
        pair(char ch,int freq)
        {
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(b.freq-a.freq));
            for(char ch:map.keySet())
            {
                pq.add(new pair(ch,map.get(ch)));
            }
        String ans="";
        while(pq.size()>0)
        {
            pair p=pq.remove();
            int freq=p.freq;
            for(int i=0;i<freq;i++)
            {
                ans+=p.ch+"";
            }
        }
        return ans;
    }
}
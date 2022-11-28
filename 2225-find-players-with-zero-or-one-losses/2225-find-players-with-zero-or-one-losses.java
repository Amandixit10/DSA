class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i[]:matches)
        {
            map.put(i[1],map.getOrDefault(i[1],0)+1);
            if(!map.containsKey(i[0]))
            {map.put(i[0],0);}
        }
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> o=new ArrayList<>();
        List<Integer> z=new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                o.add(i);
            }
            else if(map.get(i)==0)
            {z.add(i);}
        }
        Collections.sort(z);
        Collections.sort(o);
        list.add(z);
        list.add(o);
        return list;
    }
}
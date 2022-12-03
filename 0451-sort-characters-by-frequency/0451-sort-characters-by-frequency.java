class Solution {
    public String frequencySort(String s) {
        ArrayList<int[]> list=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder str=new StringBuilder();
        for(char ch:map.keySet())
        {
           list.add(new int[]{ch-'a',map.get(ch)});
        }
        Collections.sort(list,(a,b)->(b[1]-a[1]));
        for(int ar[]:list)
        {
            for(int j=0;j<ar[1];j++)
            {
                str.append((char)(ar[0]+'a'));
            }
        }
        return str.toString();
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String i:strs)
        {
         char ar[]=new char[26];
            for(char j:i.toCharArray())
            {
                ar[j-'a']++;
            }
            String s=String.valueOf(ar);
            ArrayList<String> list;
            if(map.containsKey(s))
            {
                list=map.get(s);
            }
            else{
                list=new ArrayList<>();
            }
            list.add(i);
            map.put(s,list);
        }
       List<List<String>> ans=new ArrayList<>();
        for(String i:map.keySet())
        {
            List<String> x=new ArrayList<>();
            for(String j:map.get(i))
            {
                x.add(j);
            }
            ans.add(x);
        }
        return ans;
    }
}
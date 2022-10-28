class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String i:strs)
        {
          int ar[]=new int[26];
            for(char j:i.toCharArray())
            {
                ar[j-'a']++;
            }
            StringBuilder s=new StringBuilder();
            for(int j:ar)
            {
                s.append(j);
                s.append("-");
            }
            String str=s.toString();
            ArrayList<String> list;
            if(map.containsKey(str))
            {
                list=map.get(str);
            }
            else{
                list=new ArrayList<>();
            }
            list.add(i);
            map.put(str,list);
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
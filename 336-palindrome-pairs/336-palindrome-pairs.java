class Solution {
    HashSet<ArrayList<Integer>> st=new HashSet<>();
    List<List<Integer>> list=new ArrayList<>();
    HashMap<String,Integer> map=new HashMap<>();
    public List<List<Integer>> palindromePairs(String[] words) {
        int n=words.length;  
        for(int i=0;i<n;i++)
        {
            map.put(words[i],i);
        }
        for(int i=0;i<n;i++)
        {
            helper(words[i],i);
        }
        for(ArrayList<Integer> i:st)
        {
            list.add(i);
        }
        return list;
    }
    boolean ispalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void helper(String s,int idx)
    {
    for(int i=0;i<=s.length();i++)
    {
        String str1=s.substring(0,i);
        String str2=s.substring(i);
        if(ispalin(str2))
        {
            String str1rev=new StringBuilder(str1).reverse().toString();    
            if(map.containsKey(str1rev)&&map.get(str1rev)!=idx)
            {
                ArrayList<Integer> x=new ArrayList<>();
                x.add(idx);
                x.add(map.get(str1rev));
                st.add(x);
            }
        }
     if(ispalin(str1))
        {
            String str2rev=new StringBuilder(str2).reverse().toString();
            if(map.containsKey(str2rev)&&map.get(str2rev)!=idx)
            {
                ArrayList<Integer> x=new ArrayList<>();
                x.add(map.get(str2rev));
                x.add(idx);
                st.add(x);
            }
        }
    }
    }
}
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        int n=paths.length;
        String ar[][]=new String[n][];
        for(int i=0;i<n;i++)
        {
            ar[i]=paths[i].split(" ");
        }
HashMap<String,ArrayList<String>> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<ar[i].length;j++)
        {
            
            String x[]=ar[i][j].split("\\.");
            String s=x[1].substring(3,x[1].length()-1);
            ArrayList<String> list;
            if(map.containsKey(s))
            {
            list=map.get(s);
                list.add(i+" "+(x[0]+".txt"));
                map.put(s,list);
            }
            else{
                list=new ArrayList<>();
                list.add(i+" "+(x[0]+".txt"));
                map.put(s,list);
            }
        }
    }
        List<List<String>> list=new ArrayList<>();
        for(String i:map.keySet())
        {
            if(map.get(i).size()>1)
            {
                List<String> x=new ArrayList<>();
                for(String j:map.get(i))
                {
                   String s[]=j.split(" ");
                    int idx=Integer.parseInt(s[0]);
                    x.add(ar[idx][0]+"/"+s[1]);
                }
                list.add(x);
            }
        }
        
        return list;
    }
}
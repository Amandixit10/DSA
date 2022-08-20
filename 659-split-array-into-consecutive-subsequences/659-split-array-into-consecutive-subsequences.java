class Solution {
    public boolean isPossible(int[] nums) {
        int n=nums.length;
        if(n<3)
        {return false;}
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int count=0;
    for(int i:nums)
    {
            ArrayList<Integer> list=new ArrayList<>();
        if(map.containsKey(i))
        {list=map.get(i);}
            list.add(0,1);
         map.put(i,list);
         if(map.containsKey(i-1))
        {   
        list=map.get(i-1);
        int val=list.remove(0);
            if(list.size()==0)
            {map.remove(i-1);}
            else{
                map.put(i-1,list);
            }
        list=map.get(i);
             list.remove(0);
            list.add(val+1);
            map.put(i,list);
        }
    }
for( int  i:map.keySet())
{
    for(int j:map.get(i))
    {
        if(j>=3)
        {count+=j;}
    }
}
        return count==n;
    }
}
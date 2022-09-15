class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int n=changed.length;
        if(n%2!=0)
        {
            return new int[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:changed)
        {map.put(i,map.getOrDefault(i,0)+1);}
        int idx=0;
        int count=0;
        int ar[]=new int[n/2];
        for(int i:changed)
        {
            if(map.containsKey(i))
            {
            map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                {map.remove(i);}
            int val=i*2;
            if(map.containsKey(val)&&map.get(val)>0)
            {
                map.put(val,map.get(val)-1);
                if(map.get(val)==0)
                {map.remove(val);}
                count++;
                ar[idx]=i;
                idx++;
            }
        }
        }
        if(count!=(n/2))
        {return new int[0];}
        return ar;
    }
}
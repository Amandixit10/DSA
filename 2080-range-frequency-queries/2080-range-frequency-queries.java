class RangeFreqQuery {
HashMap<Integer,ArrayList<Integer>> map;
    public RangeFreqQuery(int[] arr) {
        map=new HashMap<>();
        for(int i:arr)
        {
            ArrayList<Integer> list=new ArrayList<>();
            map.put(i,list);
        }
        for(int i=0;i<arr.length;i++)
        {
            ArrayList<Integer> list=map.get(arr[i]);
            list.add(i);
            map.put(arr[i],list);
        }
    }
    
    public int query(int left, int right, int value) {
    
        ArrayList<Integer> list=map.get(value);
        if(!map.containsKey(value)||list.get(0)>right||list.get(list.size()-1)<left)
        {return 0;}
        int a=0;
        int b=0;
        int hi=list.size();
        int lo=-1;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(list.get(mid)<=right)
            {
                lo=mid;
            }
            else{
                hi=mid;
            }
        }
        a=lo;
        hi=list.size();
        lo=-1;
            while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(list.get(mid)>=left)
            {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
        b=hi;
        if(a==-1&&b==list.size())
        {return list.size();}
        else if(a==-1)
        {
            return b+1;
        }
        else if(b==list.size())
        {
            return list.size()-a;
        }
return a-b+1;
    }
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
class TimeMap {
    class pair{
        int val;
        String nm;
        pair(int val,String nm)
        {
            this.val=val;
            this.nm=nm;
        }
    }
HashMap<String,ArrayList<pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<pair> list;
        if(map.containsKey(key))
        {
            list=map.get(key);
            list.add(new pair(timestamp,value));
            map.put(key,list);
        }
        else{
            list=new ArrayList<>();
            list.add(new pair(timestamp,value));
            map.put(key,list);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {return "";}
       return bs(map.get(key),timestamp); 
    }
    String bs(ArrayList<pair> list,int time)
    {
        int hi=list.size();
        int lo=-1;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(list.get(mid).val<=time)
            {
                lo=mid;
            }
            else{
                hi=mid;
            }
        }
      if(lo==-1)
      {
       if(list.get(hi).val>time)
       {return "";}
          return list.get(hi).nm;
      }
      if(list.get(lo).val>time)
      {return "";}
        return list.get(lo).nm;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
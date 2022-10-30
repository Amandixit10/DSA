class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        TreeMap<Long,Integer> map=new TreeMap<>();
       map.put((long)nums[n-1],1);
        for(int i=n-2;i>=0;i--)
        {
            long b=nums[i];
            long a=b+1;
           if(map.ceilingKey(a)!=null)
           {
               if(map.get(map.ceilingKey(a))>=2)
               {
               return true;
               }
               map.put(b,map.get(map.ceilingKey(a))+1);
           }
            else{
                map.put(b,1);
            }
        }
        return false;
    }
}
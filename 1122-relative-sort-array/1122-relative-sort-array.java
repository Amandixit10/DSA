class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:arr1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int idx=0;
        for(int i=0;i<arr2.length;i++)
        {
            int count=0;
         while(count<map.get(arr2[i]))
         {
             arr1[idx]=arr2[i];
             count++;
             idx++;
         }
            map.remove(arr2[i]);
        }
        for(int i:map.keySet())
        {
          for(int j=0;j<map.get(i);j++)
          {
              arr1[idx]=i;
              idx++;
          }
              
        }
        return arr1;
    }
}
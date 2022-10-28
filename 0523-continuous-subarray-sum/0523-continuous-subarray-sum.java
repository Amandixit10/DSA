class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
       sum+=nums[i];
            int mod=sum%k;
            if(map.containsKey(mod)&&i-map.get(mod)>1)
            {
             return true;   
            }
            if(!map.containsKey(mod))
            {
                map.put(mod,i);
            }
        }
        return false;
    }
}
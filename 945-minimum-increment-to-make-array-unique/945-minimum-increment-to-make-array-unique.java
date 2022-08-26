class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
int start=0;
        while(i<nums.length)
        {
            int j=i;
            int count=0;
            while(j<nums.length&&nums[i]==nums[j])
            {
             j++; 
                count++;
            }
                ans+=((count-1)*(count))/2;
              if(nums[i]<=start)
              {ans+=(start-nums[i])*count;
                  start+=count;
                      
              }
            else{
                start=nums[i]+count;
            }
            i=j;
       // System.out.println(ans+" "+start+" "+count);
        }
        return ans;
    }
}
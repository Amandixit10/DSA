class Solution {
    public int longestNiceSubarray(int[] nums) {
        int xor=0;
        int i=0;
        int j=0;
        int n=nums.length;
        int max=0;
        while(j<n)
        {
         if((xor&nums[j])!=0)
         {
             while((xor&nums[j])!=0)
             {
             xor^=nums[i];
             i++;
         }
         }
          max=Math.max(max,j-i+1);
            xor^=nums[j];
            j++;
        }
        return max;
    }
}
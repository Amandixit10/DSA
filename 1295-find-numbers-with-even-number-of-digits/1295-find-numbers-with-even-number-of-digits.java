class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            int digc=0;
            while(i>0)
            {
                digc+=1;
                i/=10;
            }
            if(digc%2==0)
            {count++;}
        }
        return count;
    }
}
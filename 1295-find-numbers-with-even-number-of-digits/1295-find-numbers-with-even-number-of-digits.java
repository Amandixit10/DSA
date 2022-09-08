class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            int digc=(int)Math.log10(i)+1;
            if((digc%2)==0)
            {count++;}
        }
        return count;
    }
}
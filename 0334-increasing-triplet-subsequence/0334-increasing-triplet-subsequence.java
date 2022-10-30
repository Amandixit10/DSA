class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i<=num1)
            {
                num1=i;
            }
            else if(i<=num2)
            {
                num2=i;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
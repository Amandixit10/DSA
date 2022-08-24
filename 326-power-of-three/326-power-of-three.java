class Solution {
    public boolean isPowerOfThree(int n) {
        return (n<3?(n==1?true:false):(n%3!=0?false:(isPowerOfThree(n/3))));
    }
}
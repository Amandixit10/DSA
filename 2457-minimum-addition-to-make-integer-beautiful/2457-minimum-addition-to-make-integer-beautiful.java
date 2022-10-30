class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long val=n;
        long base=1L;
        while(sum(n)>target)
        {
            n=(n/10)+1;
            base*=10;
        }
        return (base*n-val);
    }
    int sum(long n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
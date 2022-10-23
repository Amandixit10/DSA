class Solution {
    public int minOperations(int n) {
        if(n%2==0)
        {
            int m1=n/2;
            int m2=m1+1;
            m1+=(m1-1);
            m2+=(m2-1);
            int mid=m1+m2;
            mid/=2;
            int i=1;
            int cnt=0;
            while(i<n)
            {
            cnt+=mid-i;
                i+=2;
            }
            return cnt;
        }
        int mid=(n/2)+1;
        mid+=(mid-1);
        int i=1;
        int cnt=0;
        while(i<mid)
        {
            cnt+=mid-i;
            i+=2;
        }
        return cnt;
    }
}
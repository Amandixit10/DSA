class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> set=new TreeSet<>();
        set.add(1L);
        int idx=1;
        while(idx<n)
        {
            Long val=set.first();
            set.add(val*2L);
            set.add(val*3L);
            set.add(val*5L);
            set.remove(val);
            idx++;
        }
        return set.first().intValue();
    }
}
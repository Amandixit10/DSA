class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums)
        {set.add(i);}
        if(set.size()<3)
        {return set.last();}
        int idx=set.size()-3;
        int j=0;
        for(int i:set)
        {
            if(j==idx)
            {return i;}
            j++;
        }
        return -1;
    }
}
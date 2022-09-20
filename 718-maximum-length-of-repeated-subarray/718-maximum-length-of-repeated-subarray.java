class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar[]=new ArrayList[101];
        for(int i=0;i<101;i++)
        {
            ar[i]=new ArrayList<>();
        }
        int n=nums1.length;
        int m=nums2.length;
        int max=0;
        for(int i=0;i<n;i++)
            {
            ar[nums1[i]].add(i);
        }
        for(int i=0;i<m;i++)
        {
            for(int k:ar[nums2[i]])
            {
                int x=i;
                for(int j=k;x<m&&j<n;j++)
                {
                 if(nums2[x]!=nums1[j])
                 {break;}
                    x++;
                }
                max=Math.max(max,x-i);
            }
        }
        return max;
    }
}
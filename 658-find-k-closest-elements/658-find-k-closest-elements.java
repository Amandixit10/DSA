class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int idx=bs(arr,x);
        //System.out.println(idx);
        List<Integer> list=new ArrayList<>();
        int i=idx;
        int j=idx-1;
        while(list.size()<k&&i<arr.length&&j>=0)
        {
            if(Math.abs(arr[i]-x)<Math.abs(arr[j]-x))
            {
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                j--;
            }
        }
        while(list.size()<k)
        {
            if(i<arr.length)
            {
                list.add(arr[i]);
                    i++;
            }
            else{
                list.add(arr[j]);
            j--;
            }
        }
        Collections.sort(list);
        return list;
    }
    int bs(int ar[],int x)
    {
        int hi=ar.length;
        int lo=-1;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(ar[mid]>x)
            {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
        return hi==ar.length?lo:hi;
    }
}
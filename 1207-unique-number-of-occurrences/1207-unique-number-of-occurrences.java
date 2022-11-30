class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       int ar[]=new int[2001];
        for(int i=0;i<arr.length;i++)
        {
        ar[arr[i]+1000]++;
        }
        Arrays.sort(ar);
        int prev=0;
        for(int i=0;i<=2000;i++)
        {
            if(ar[i]!=0&&ar[i]==prev)
            {return false;}
            else if(ar[i]!=0)
            {prev=ar[i];}
        }
        return true;
    }
}
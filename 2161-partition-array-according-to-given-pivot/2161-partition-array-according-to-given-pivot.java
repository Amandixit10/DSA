class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int idx=0;
        int n=nums.length;
        int i=0;
        int j=n-1;
        int ar[]=new int[n];
        while(idx<n)
        {
            if(nums[idx]<pivot)
            {
                ar[i]=nums[idx];
                i++;
            }
            else if(nums[idx]>pivot)
            {
                ar[j]=nums[idx];
                j--;
            }
            idx++;
        }
int x=j+1;
        int y=n-1;
        while(x<y)
        {
            int t=ar[y];
            ar[y]=ar[x];
            ar[x]=t;
            x++;
            y--;
        }
while(i<=j)
{
ar[i]=pivot;
    i++;
}
        return ar;
    }
}
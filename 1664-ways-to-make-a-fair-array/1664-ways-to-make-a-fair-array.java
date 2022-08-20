class Solution {
    public int waysToMakeFair(int[] nums) {
int n=nums.length;
        int suffeven[]=new int[n+1];
        int suffodd[]=new int[n+1];
        int preeven[]=new int[n+1];
        int preodd[]=new int[n+1];
        if(n%2==0)
        {
            suffodd[n-1]=nums[n-1];
        }
        else{
            suffeven[n-1]=nums[n-1];
        }
        preeven[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            preeven[i]=preeven[i-1];
            preodd[i]=preodd[i-1];
            if(i%2==0)
            {
                preeven[i]+=nums[i];
            }
            else{
                preodd[i]+=nums[i];
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            suffeven[i]=suffeven[i+1];
            suffodd[i]=suffodd[i+1];
            if(i%2==0)
            {
                suffeven[i]+=nums[i];
            }
            else{
                suffodd[i]+=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            
          int even=suffodd[i+1];
          int odd=suffeven[i+1];
          
            if(i%2==0)
            {
                even+=(i==0?0:preeven[i-1]);
                odd+=(i==0?0:preodd[i-1]);
            }
             else
            {
                even+=(i==0?0:preeven[i-1]);
                odd+=(i==0?0:preodd[i-1]);
            }
           // System.out.println(even+" "+odd);
            if(even==odd)
            {count++;}
        }
        return count;
    }
}
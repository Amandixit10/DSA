class Solution {
    int pre[][];
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        pre=new int[n][32];
        for(int i=0;i<n;i++)
        {
            int val=nums[i];
            int idx=0;
            while(val>0)
            {
              pre[i][idx]=val%2==1?1:0;
                idx++;
                val/=2;
            }
            if(i>0)
            {
            for(int j=0;j<32;j++)
            {
                pre[i][j]+=pre[i-1][j];
            }
            }
        }

        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int ar[]=new int[32];
            int val=0;
            for(int j=0;j<32;j++)
            {
                ar[j]=pre[n-1][j];
                if(i>0)
                {
                  ar[j]-=pre[i-1][j]; 
                }
                if(ar[j]>0)
                {
                val+=1<<j;
                }
            }
          //  System.out.println(val);
          ans[i]=bs(i-1,n,val)-i+1;  
        }
        return ans;
    }
    int bs(int s,int e,int max)
    {
      int hi=e;
        int lo=s;
        while(hi-lo>1)
        {
        int mid=lo+(hi-lo)/2;
        int ar[]=new int[32];
            int val=0;
            for(int i=0;i<32;i++)
            {
                ar[i]=pre[mid][i];
                if(s>=0)
                {
                    ar[i]-=pre[s][i];
                }
                if(ar[i]>0)
                {
                val+=1<<i;
                }
            }
         //   System.out.print(mid+"-"+val+" ");
            if(val==max)
            {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
       // System.out.println();
        return hi==e?lo:hi;
    }
}
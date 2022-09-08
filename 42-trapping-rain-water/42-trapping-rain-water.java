class Solution {
    public int trap(int[] height) {
        // this can be done like , first calculate all left side traps and then calculate all right side traps
        
        // calculating right side traps
        
        int n=height.length;
        int sum=0;
        int total=0;
        int i=-1;
        int j=-1;
        for(int x=0;x<n;x++)
        {
    if(height[x]!=0)
    {
    i=x;
    j=x;
        break;
    }
    }
if(i==-1)
{return 0;}
        while(j<n)
      {
        sum+=height[j];
       if(height[j]>=height[i])
        {
           sum-=height[i]+height[j];
         //  System.out.print(j+"  ");
  int val=(height[i]*(j-i-1))-sum;
        //   System.out.println(val);
           total+=val;
           sum=height[j];
           i=j;
        }     
            j++;
     }
        int idx=i;
        i=n-1;
        j=n-1;
        sum=0;
        while(j>=idx)
        {
         sum+=height[j];
       if(height[j]>=height[i])
        {
           sum-=height[i]+height[j];
          // System.out.print(j+"  ");
  int val=(height[i]*(i-j-1))-sum;
       //    System.out.println(val+" "+sum);
           total+=val;
           sum=height[j];
           i=j;
        }     
            j--;   
        }
return total;
        
    }
}
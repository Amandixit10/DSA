class Solution {
    public boolean validUtf8(int[] data) {
        int idx=0;
        int n=data.length;
        while(idx<n)
        {
            int len=helper(data[idx]);
            if(len>4)
            {return false;}
            if(len==0)
            {idx++;}
            if(len==1)
            {
                int mask=1<<7;
                if((mask&data[idx])!=0)
                {
                 return false;  
                }
            }
            else if(idx+len<=n&&check(data,idx,len))
            {
                idx+=len;
            }
            else{
                return false;
            }
        }
        return true;
    }
    int helper(int num)
    {
       int idx=0;
        int i=0;
        int len=0;
        while(num>0)
        {
            if(num%2==0)
            {idx=i;}
            i++;
            num/=2;
            len++;
        }
        if(len<8)
        {return 0;}
        return 8-idx-1;
    }
    boolean check(int data[],int idx,int len)
    {
        int mask=1<<7;
        for(int i=idx+1;i<idx+len;i++)
        {
     if((mask&data[i])!=mask)
     {
         return false;}
        }
        return true;
    }
}
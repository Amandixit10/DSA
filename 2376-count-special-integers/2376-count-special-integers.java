class Solution {
    public int countSpecialNumbers(int n) {
        int size=0;
        Stack<Integer> st=new Stack<>();
        while(n>0)
        {
            size++;
            st.push(n%10);
            n/=10;  
        }
        int ans=0;
    for(int i=1;i<size;i++)
    {
        int count=1;
        int num=9;
        for(int j=1;j<i;j++)
        {
            count*=num;
            num--;
        }
        ans+=9*count;
    }
        //System.out.println(ans);
        int ar[]=new int[10];
        for(int i=1;i<=size;i++)
        {
            int num=st.pop();
            int val=num;
            if(i==1)
            {val-=1;}
            int count=1;
            int x=10-i;
            for(int j=i+1;j<=size;j++)
            {
              count*=x;
                x--;
            }
         for(int j=0;j<num;j++)
            {
            if(ar[j]>0)
            {val--;}
            }
            count*=val;
        //  System.out.println(count+" "+val);
            ans+=count;
            ar[num]+=1;
            if(ar[num]>1)
            {
                return ans;
            }
        }
        return ans+1;
    }
}
class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        Stack<Integer> st=new Stack<>();
        int size=0;
        int x=n;
        while(x>0)
        {
           st.push(x%10);
            size++;
            x/=10;
            
        }
        int ans=0;
        int count=digits.length;
        for(int i=1;i<size;i++)
        {
         ans+=count;
            count*=digits.length;
        }
        int idx=0;
        int num=0;
       for(int i=0;i<size;i++)
       {
           num=st.pop();
           idx=help(num,digits);
        ans+=(idx)*(int)Math.pow(digits.length,(size-(i+1)));
          // System.out.println(ans);
           if(idx>=digits.length||Integer.parseInt(digits[idx])!=num)
           {
               return ans;
           }
       }
        if(idx<digits.length&&Integer.parseInt(digits[idx])==num)
        {
            ans++;
        }
        return ans;
    }
    int help(int num,String ar[])
    {
        int idx=0;
    while(idx<ar.length)
    {
            if(Integer.parseInt(ar[idx])>=num)
            {return idx;}
            idx++;
        }
        return idx;
    }
}
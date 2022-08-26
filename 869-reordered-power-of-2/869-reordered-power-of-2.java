class Solution {
    public boolean reorderedPowerOf2(int n) {
int count=0;
        int num=1;
        
        while(count<31)
        {
            boolean ans=true;
            int check_num=num;
            int check_n=n;
            int ar[]=new int[10];
            while(check_num>0)
            {
                ar[check_num%10]++;
                check_num/=10;
            }
             while(check_n>0)
            {
                ar[check_n%10]--;
                 check_n/=10;
            }
            for(int i:ar)
            {if(i!=0)
            {ans=false;}}
            if(ans)
            {return true;}
            num*=2;
            count++;
        }
        return false;
    }
}
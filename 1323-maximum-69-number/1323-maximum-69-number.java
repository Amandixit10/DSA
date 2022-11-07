class Solution {
    public int maximum69Number (int num) {
        int idx=-1;
        int len=0;
        int val=num;
        while(val>0)
        {
            if(val%10==6)
            {
              idx=len;  
            }
            val/=10;
            len++;
        }
        return idx==-1?num:num+3*(int)Math.pow(10,idx);
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)
        {return false;}
      int val=(int)(Math.log(n)/Math.log(4));
        if((int)Math.pow(4,val)==n)
        {return true;}
        return false;
    }
}
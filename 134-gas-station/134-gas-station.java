class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int i=0;
        while(i<n)
        {
            int amt=gas[i]-cost[i];
            if(amt<0)
            {
                i++;
                continue;
            }
       // System.out.println(amt);
            int j=(i+1)%n;
            while(j!=i)
            {
                amt+=gas[j]-cost[j];
                if(amt<0)
                {
                    break;
                }
                j=(j+1)%n;
            }
            if(j==i)
            {
                return i;
            }
            if(j<i)
            {return -1;}
            else{
                i=j;
            }
            
        }
        return -1;
    }
}
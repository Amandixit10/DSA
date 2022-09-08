class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:digits)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        int ar[]=new int[10];
        for(int i=100;i<1000;i+=2)
        {
            int val=i;
            while(val>0)
            {ar[val%10]++;
            val/=10;}
            boolean f=true;
            for(int j=0;j<10;j++)
            {
                if(ar[j]>0&&(!map.containsKey(j)||map.get(j)<ar[j]))
                {
                    f=false;
                }
                ar[j]=0;
             }
            if(f)
            {
                list.add(i);
            }
        }
        int a[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            a[i]=list.get(i);
        }
        return a;
    }
}
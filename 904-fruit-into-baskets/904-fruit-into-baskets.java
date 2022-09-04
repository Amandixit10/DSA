class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0;
        int j=0;
        int last=0;
        int max=0;
        HashSet<Integer> set=new HashSet<>();
         while(j<n)
         {
             if(set.size()<2)
             {
                 set.add(fruits[j]);
             }
             else if(!set.contains(fruits[j]))
             {
                 max=Math.max(max,j-i);
               i=last;
                 set.remove(fruits[last-1]);
                 set.add(fruits[j]);
             }
             if(j>0&&fruits[j]!=fruits[j-1])
             {last=j;}
             j++;
         }
        return Math.max(max,j-i);
    }
}
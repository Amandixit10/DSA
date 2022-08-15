class Solution {
    public int romanToInt(String s) {
        s+=" ";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        map.put(' ',0);
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
          //  System.out.println(i);
            int a=map.get(s.charAt(i+1));
            int b=map.get(s.charAt(i));
            if(b<a)
            {
            count+=(a==1000?900:(a==500?400:(a==50?40:(a==100?90:(a==5?4:(9))))));
                i+=1;
            }
            else{
                count+=b;
            }
           //System.out.println(count+" "+i);
        }
        return count;
    }
}
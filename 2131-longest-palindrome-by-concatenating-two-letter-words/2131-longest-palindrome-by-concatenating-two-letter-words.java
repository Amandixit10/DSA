class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:words)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        boolean mid=false;
        for(String i:map.keySet())
        {
            if(map.get(i)>0)
            {
                String check=new StringBuilder(i).reverse().toString();
                if(map.containsKey(check))
                {
                    if(check.equals(i))
                    {
                        if(map.get(check)%2==0)
                        {count+=map.get(check);}
                        else{
                            if(mid)
                            {
                                count+=map.get(check)-1;
                            }
                            else{
                                count+=map.get(check);
                                mid=true;
                            }
                        }
                    }
                    else{
                      count+=Math.min(map.get(i),map.get(check))*2; 
                        map.put(check,-1);
                    }
                }
            }
        }
        return count*2;
    }
}
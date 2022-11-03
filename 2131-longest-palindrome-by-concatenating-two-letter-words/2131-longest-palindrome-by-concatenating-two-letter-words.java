class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:words)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int cnt=0;
        int odd=0;
        HashSet<String> set=new HashSet<>();
        for(String i:words)
        {
            if(set.contains(i))
            {continue;}
            String s=new StringBuilder(i).reverse().toString();
            if(s.equals(i))
            {
                int val=map.get(i);
                if(val%2!=0)
                {
                    odd=1;}
                val-=val%2;
            cnt+=val;
            }
            else if(map.containsKey(s))
            {
                cnt+=Math.min(map.get(i),map.get(s))*2;
            }
            set.add(i);
            set.add(s);
        }
        cnt+=odd;
        return cnt*2;
    }
}
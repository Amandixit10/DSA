class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Queue<String> q=new ArrayDeque<>();
        for(int i=1;i<10;i++)
        {
            q.add(i+"");
        }
        int level=2;
        while(level<=n)
        {
            int size=q.size();
            while(size-->0)
            {
                String num=q.remove();
                int len=num.length();
                int a=num.charAt(0)-'0';
                int b=num.charAt(len-1)-'0';
                if(b+k<=9)
                {q.add(num+((b+k)+""));}
                if(b-k>=0)
                {q.add(num+((b-k)+""));}
                if(a+k<=9)
                {q.add(((a+k)+"")+num);}
            }
            level+=1;
        }
        HashSet<String> set=new HashSet<>();
        while(q.size()>0)
        {
            String x=q.remove();
            if(x.charAt(0)!='0')
            {
            set.add(x);
            }
        }
        int ans[]= new int[set.size()];
        int idx=0;
        for(String i:set)
        {
            ans[idx]=Integer.parseInt(i);
        idx++;
        }
        return ans;
    }
}
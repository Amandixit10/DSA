class Solution {
    class trie{
        int val=0;
        trie ar[]=new trie[26];
    }
    trie root=new trie();
    void add(String s)
    {
        trie curr=root;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(curr.ar[ch-'a']==null)
            {
                curr.ar[ch-'a']=new trie();
            }
curr=curr.ar[ch-'a'];
            curr.val+=1;
          //  System.out.print(ch+" "+curr.val+" - ");
        }
       // System.out.println();
    }
    int update(String s)
    {
        int count=0;
     trie curr=root;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(curr.ar[ch-'a']==null)
            {
               //System.out.println();
                return count;
            }
curr=curr.ar[ch-'a']; 
            count+=curr.val;
        } 
        
        return count;
    }
    public int[] sumPrefixScores(String[] words) {
        for(String i:words)
        {
 add(i);
        }
        int ans[]=new int[words.length];
        int idx=0;
       for(String i:words)
        {
           ans[idx]=update(i);
           idx++;
        }
        return ans;
    }
}
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        if(n==0||power<tokens[0])
        {return 0;}
        int pre[]=new int[n];
        pre[0]=tokens[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=tokens[i]+pre[i-1];
        }
        int sum=power;
        int score=1;
        sum-=tokens[0];
        int i=1;
        int j=n-1;
        int max=1;
        while(i<=j)
        {
            if(sum>=tokens[i])
            {
                sum-=tokens[i];
                i++;
                score+=1;
            }
            else{
                sum+=tokens[j];
                j--;
                score-=1;
            }
            max=Math.max(max,score);
        }
        return max;
    }

}
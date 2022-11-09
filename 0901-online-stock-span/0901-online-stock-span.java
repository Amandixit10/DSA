class StockSpanner {
    class pair{
        int val;
        int days;
        pair(int val,int days)
        {
            this.val=val;
            this.days=days;
        }
    }
Stack<pair> st;
    public StockSpanner() {
      st=new Stack<>();  
    }
    
    public int next(int price) {
        int cnt=1;
        while(st.size()>0&&st.peek().val<=price)
        {
            cnt+=st.pop().days;
        }
        st.push(new pair(price,cnt));
        return st.peek().days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
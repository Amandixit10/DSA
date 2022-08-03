class MyCalendar {
    class pair{
        int start;
        int end;
        pair(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
ArrayList<pair> list;
    public MyCalendar() {
      list=new ArrayList<>();  
    }
    
    public boolean book(int start, int end) {
        if(list.size()==0)
        {
            list.add(new pair(start,end));
            return true;
        }
        /*for(pair i:list)
        {
            System.out.print(i.start+" "+i.end+" --- ");
        }
        System.out.println();*/
        int s=list.get(0).start;
        int e=list.get(0).end;
        boolean isAvailable=false;
        ArrayList<pair> temp=new ArrayList<>();
        if(end<=s)
        {
            temp.add(new pair(start,end));
            isAvailable=true;
        }
        temp.add(new pair(s,e));
        for(int i=1;i<list.size();i++)
        {
         int currS=list.get(i).start;
            int currE=list.get(i).end;
            if(currS>=e)
            {
                if(start>=e&&end<=currS&&!isAvailable)
                {
                    temp.add(new pair(start,end));
                    isAvailable=true;
                }
                s=currS;
                e=currE;
            }
            else{
                e=Math.max(e,currE);
            }
            temp.add(new pair(currS,currE));
        }
        if(start>=e)
        {
            temp.add(new pair(start,end));
            isAvailable=true;
        }
        list=new ArrayList<>(temp);
        /**/
        return isAvailable;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
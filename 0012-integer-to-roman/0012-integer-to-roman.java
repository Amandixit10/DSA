class Solution {
    public String intToRoman(int num) {
        if(num==0)
        {return "";}
        String ans="";
        if((num>=1000))
        {
        for(int i=0;i<num/1000;i++)
        {
            ans+="M";
        }
            ans+=intToRoman(num%1000);
        }
        else if(num>=900)
        {
            ans+="CM";
             ans+=intToRoman(num%900);
        }
        else if(num>=500)
        {
        for(int i=0;i<num/500;i++)
        {
            ans+="D";
        }
            ans+=intToRoman(num%500);
        }
        else if(num>=400)
        {
            ans+="CD";
            ans+=intToRoman(num%400);
        }
        else if(num>=100)
        {
        for(int i=0;i<num/100;i++)
        {
            ans+="C";
        }
            ans+=intToRoman(num%100);
        }
        else if(num>=90)
        {
            ans+="XC";
            ans+=intToRoman(num%90);
        }
        else if(num>=50)
        {
        for(int i=0;i<num/50;i++)
        {
            ans+="L";
        }
            ans+=intToRoman(num%50);
        }
        else if(num>=40)
        {
            ans+="XL";
            ans+=intToRoman(num%40);
            
        }
        else if(num>=10)
        {
        for(int i=0;i<num/10;i++)
        {
            ans+="X";
        }
            ans+=intToRoman(num%10);
        }
        else if(num>=9)
        {
            ans+="IX";
          ans+=intToRoman(num%9);
        }
        else if(num>=5)
        {
        for(int i=0;i<num/5;i++)
        {
            ans+="V";
        }
            ans+=intToRoman(num%5);
        }
        else if(num>=4)
        {
            ans+="IV";
            ans+=intToRoman(num%4);
        }
        else if(num>=1)
        {
        for(int i=0;i<num/1;i++)
        {
            ans+="I";
        }
            ans+=intToRoman(num%1);
        }
        return ans;
    }
}
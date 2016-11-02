class p03
{
    void accept(int n)
    {
        String temp="";
        int r,d,rem,l,i;
        
        
        while(n!=0)
        {
            d=n%2;
            temp=temp+d;
            n=n/2;
        }
        l=temp.length();
        char ch;
        for(i=l-1;i>=0;i--)
        {  ch=temp.charAt(i);
            System.out.print(ch);
        }    
  
    }
}
            
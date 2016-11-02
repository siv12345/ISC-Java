class p05
{
    void accept(int n)
    {   int r,i,l;
        String temp="";
        char ch;
        while(n!=0)
        {
            r=n%16;
            if(r<=9)
            {
                temp=temp+r;
            }
            else if(r==10)
            {
                temp=temp+"A";
            }
            else if(r==11)
            {
                temp=temp+"B";
            }
            else if(r==12)
            {
                temp=temp+"C";
            }
            else if(r==13)
            {
                temp=temp+"D";
            }
            else if(r==14)
            {
                temp=temp+"E";
            }
            else if(r==15)
            {
                temp=temp+"F";
            }
            n=n/16;
        }
        l=temp.length();
        for(i=l-1;i>=0;i--)
     {
            ch=temp.charAt(i);
            System.out.print(ch);
        }
    }
}
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
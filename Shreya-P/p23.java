class p23
{
    void compute(String C,int S )
    {
        int l,i,a,sum=0,sum1=0;
        char ch1,ch,ch2;
        l=C.length();
        System.out.println("Coded text= " +C);
        System.out.println("Shift= " +S);
        if(S>26)
        {
            System.out.println("Invalid Shift Value");
            System.exit(0);
        }
        System.out.print("Decoded text = ");
        for(i=0;i<=l+1;i++)
        {
            ch=C.charAt(i);
            ch2=C.charAt(i+1);
            if(ch=='Q'&&ch2=='Q')
            {
                System.out.print(" ");
            }
            if(ch!=' ')
            {
                a=(int)ch;
                sum =a+(S-1);
                sum1=sum-26;
                if(sum1==65)
                {
                   ch1=(char)sum1;
                   System.out.print(ch1);
                }
                else if(sum1>=66)
                {
                  ch1=(char)sum1;
                  System.out.print(ch1);
                }
                
            }
        }
    }
}
                
                
            


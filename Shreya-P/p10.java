class p10
{
    void accept(int n)
    {
        int sq,temp,sum=0,r;
        sq=n*n;
        temp=n;
        
        while(sq>0)
        {
            r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if(sum == temp)
        {
            System.out.println("NEON Number");
        }
        else if(sum!=temp)
        {
            System.out.println("Not NEON");
        
        }
    }
}

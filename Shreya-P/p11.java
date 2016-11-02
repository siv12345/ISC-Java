class p11
{
    int isPrime(int m)
    {
        int i;
        for(i=2;i<m;i++)
        {
            if(m%i==0)
            {
                return 0;
            }
            
        }return 1;
    }
    void accept(int n)
    {
        int r,sum=0,temp=n;
        while(n>0)
        { 
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        if(temp==sum && isPrime(temp)==1)
        {
            System.out.println("Pal-Prime Number");
        }
        else
        {
            System.out.println("Not Pal-prime");
        }

    }
}
        

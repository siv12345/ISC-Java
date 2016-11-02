class p12
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
        
        if(isPrime(sum)==1 && isPrime(temp)==1)
        {
            System.out.println("Emirp Number");
        }
        else
        {
            System.out.println("Not Emirp Number");
        }
    }
    
    }


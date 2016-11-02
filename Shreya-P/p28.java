class p28
{
    boolean isPrime(int n)
    {   int cnt=0;
        for(int i=2;i<n;i++)
        { if(n%i==0)
          {cnt++;}
        }
        if(cnt==0)
        {return true;}
        else 
        return false;
    }
   void input(int n)
    {   int r,sum=0;
        if(isPrime(n)==false)
        {   System.exit(0); }
        else
        {   while(n>0)
            {
                r=n%10;
                sum=sum+r;
                n=n/10;
            }
        }
        System.out.println(sum);
   }
}
            
            
              
                  
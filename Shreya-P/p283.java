    class p283
{    
    int isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            { return 0;}            
        }
        return 1;
    }
    int sumDigits(int n)
    {
        int sum=0;
        while(n>0)
        {   sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }       
    int sumPrime(int n)
    {
        int i=2, sum1=0;
        while(n>1)
        {
            if(n%i==0)
            {
              if(isPrime(i)==1)
              {
                sum1=sum1+sumDigits(i);          
                n=n/i;
              }
            }
            else
            {   i++;  }
        }
        return sum1;
    }
    void compute(int n)
    {
        int a= sumDigits(n);
        int b= sumPrime(n);
        if(a==b)
        {
            System.out.println("Smith no.");
        }
        else
        {
        System.out.println("Not a Smith no."); 
        }
    }
}
       

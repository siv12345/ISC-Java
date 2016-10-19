class smith
{
    int sum1 = 0;
    public void accept(int n)
    { 
        int m = n;
        for(int i = 2;i <= n;)
        {    
            if (n %i ==0 && isPrime(i))
            {
                sum1 += summation(i);
                n = n/i;
            }
            else 
            i++;
        }
        if(summation(m)==sum1)
            System.out.println("yes");
        else
        System.out.println("no");
    }
    boolean isPrime(int x)
    {   int c = 0 ; 
        for (int i = 1; i <=x ; i++)
        {
            if(x%i==0)
            c++;
        }
        return c==2?true:false;
    }
    int summation (int y)
    {   int sum = 0; 
        for(int i = 0; i < Integer.toString(y).length(); i ++)
        sum += Character.getNumericValue(Integer.toString(y).charAt(i));
        return sum;
    }
}

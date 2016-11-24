public class SmithNo
{
    public boolean prime(int x)
    {
        int c = 0;
        for(int i = 1; i<=x; i++)
        {
            if(x%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }            
    public void main(int n)
    {
        int sum1=0, sum2 = 0, m = n;
        while(m>0)
        {
            int r = m%10;
            sum1 = sum1 + r;
            m = m/10;
        }
        for(int i = 2; i<=n;)
        {
           if(n%i==0&&prime(i)==true)
           {
               int j = i;
               while(j>0)
               {
                   int a = j%10;
                   sum2 = sum2 + a;
                   j = j/10;
               }
               n = n/i;
           }
           else
           i++;
        }
        if(sum1==sum2)
        System.out.println("Smith number");
        else
        System.out.println("Not a smith number");
    }
}

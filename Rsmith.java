class smith
{
    public void accept(int n)
    {
        int k=n,sum1=0,sum2=0,c=0,j=0;
        for(int l=0;l<Integer.toString(k).length();l++)
                  sum2+=Character.getNumericValue(Integer.toString(k).charAt(l));
        for(int i=2;i<=n;)
        {
            if(n%i==0)
            {
                for(int h=1;h<=i;h++)
                if(i%h==0)
                c++;
               if(c==2)
                {
                  for(int l=0;l<Integer.toString(i).length();l++)
                  sum1+=Character.getNumericValue(Integer.toString(i).charAt(l));
                  n=n/i;
                }   
                c=0;
            }
            else
            i++;
        }
        System.out.println((sum2==sum1)?"YES":"NO");
    }
}

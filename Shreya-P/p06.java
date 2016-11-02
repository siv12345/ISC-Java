class p06
{
    void accept(int n)
    {
        int i,l,sum=0;
        for(i=2;i<=n;i++)
        {
            for(l=1;l<=i;l++)
            {
                sum=sum+l;
            }
        }
        System.out.println(sum);
    }
}

        

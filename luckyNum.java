class luckyNum
{
    public void accept(int n)
    {
        int a[]=new int[n],j=0;
        for(int i=0;i<n;i++)
            a[i]=i+1;
        for(int i=2;i<=n;i++)
        {
            for(int k=0;k<n;k++)
            {
                if(a[k]!=0)
                j++;
                if(j%i==0)
                a[k]=0;
            }
            j=0;
        }
        for(int i=0;i<n;i++)
        if(a[i]!=0)
        System.out.println(a[i]);
        }
    }

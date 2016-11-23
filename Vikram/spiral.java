class spiral
{
    public static void main(int n)
    {       
        int arr[][]=new int[n][n];
        int d=0,a=0,b=0, e=0, k=n, i=0, c=1, f=1, m=n-1;
        while(i<=n*n)
        {
            for(int j=d;j<=n+d-1;j++)
               { arr[d][j]=c++;a=j;}
            --n;
            for(int j=f;j<=n+f-1;j++)
                {arr[j][a]=c++;b=j;}
            for(int j=b-1;j>b-1-n;j--)
               { arr[b][j]=c++;e=j;}
            --n;
            for(int j=m-1;j>b-1-n;j--)
                {arr[j][e]=c++;d=j;}
            f++;
            m--;
        }
        for(int l=0;l<k;l++)
        {
            for(int j=0;j<k;j++)
            {System.out.print(arr[l][j]+"\t");}
            System.out.println();
        }
    }
}

class circu
{
    public void accept(int n)
    {
        int a[][] = new int[n][n],rowlim1=0,collim1=0,rowlim2=n-1,collim2=n-1,k=1,m=0;        
        while(k<=n*n)
        {
           for(int i=collim1+m;i<=collim2-m;i++)           
              a[rowlim1+m][i]=k++;           
           for(int j=rowlim1+1+m;j<=rowlim2-m;j++)           
              a[j][collim2-m]=k++;           
           for(int i=collim2-1-m;i>=collim1+m;i--)           
             a[rowlim2-m][i]=k++;            
           for(int j=rowlim2-1-m;j>=rowlim1+1+m;j--)           
             a[j][collim1+m]=k++;           
           m++;
        }        
        for(int i=0;i<n;i++)
        {            
            for(int j=0;j<n;j++)
              System.out.print(a[i][j]+"\t");   
            System.out.println();
        }
    }
}

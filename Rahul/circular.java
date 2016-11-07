class circular
{
    public void accept(int n)
    {
        int a[][] = new int[n][n],rowlim1=0,collim1=0,rowlim2=n-1,collim2=n-1,k=1;        
        while(k<=n*n)
        {
           for(int i=collim1;i<=collim2;i++)           
              a[rowlim1][i]=k++;           
           for(int j=rowlim1+1;j<=rowlim2;j++)           
              a[j][collim2]=k++;           
           for(int i=collim2-1;i>=collim1;i--)           
             a[rowlim2][i]=k++;            
           for(int j=rowlim2-1;j>=rowlim1+1;j--)           
             a[j][collim1]=k++;           
           collim1++;           
           rowlim1++;
           collim2--;
           rowlim2--;
        }        
        for(int i=0;i<n;i++)
        {            
            for(int j=0;j<n;j++)
              System.out.print(a[i][j]+" ");   
            System.out.println();
        }
    }
}

class p02
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        int i,l,j,temp;
        l=a.length;
        
       
        for(i=0;i<l;i++)
        {
            for(j=0;j<l-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
    }
}

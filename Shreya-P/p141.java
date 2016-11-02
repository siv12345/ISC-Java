
class p141
{
    void accept()
    {
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r,r1,c1,c,sum=0;
        System.out.println("Original Matrix-1" );
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println("");
        }
        System.out.println("Original Matrix-2" );
        for(r1=0;r1<3;r1++)
        {
            for(c1=0;c1<3;c1++)
            {
                System.out.print(b[r1][c1]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sum of Matrix");
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(a[r][c]+b[r][c]+" ");
                
               
            }
            System.out.println("");
            
        }
    }
}
import java.util.*;
class matrix
{
    public static void m()
    {
        int a[][]={{4,2,4,1},{6,9,2,6},{3,1,8,2},{7,7,3,1}};
        int s=0;
        for(int i=0;i<4;i++)
        { 
            for(int j=0;j<4;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++)
        {   s = 0;
            for(int j=0;j<a.length;j++)
            {
               s = s + a[i][j];
            }
            System.out.println("Sum of row: "+i+" = "+s);
        }
        for(int i=0;i<a.length;i++)
        {   s = 0;
            for(int j=0;j<a.length;j++)
            {
               s = s + a[j][i];
            }
            System.out.println("Sum of column: "+i+" = "+s);
        }
        int b[]={4,2,5,2,1};
        System.out.println(Arrays.toString(b));
       
           System.out.println(Arrays.deepToString(a));
        
    }
}
        
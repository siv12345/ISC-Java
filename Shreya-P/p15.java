
import java.util.*;
class p15
{
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            int a[][]=new int[3][3];
            int b[][]=new int[3][3];
            int r, c;
            for(r=0;r<3;r++)
            {
                for(c=0;c<3;c++)
                {
                    System.out.println("Enter a number for Matrix 1");
                    a[r][c]=sn.nextInt();
                    System.out.println("Enter a number for Matrix 2");
                    b[r][c]=sn.nextInt();
                }
            }
            
            System.out.println("Original Matrix 1");
            for(r=0;r<3;r++)
            {
                for(c=0;c<3;c++)
                {
                    System.out.print(a[r][c]);
                }
                System.out.println("");
             }
             System.out.println("Original Matrix 2");
            for(r=0;r<3;r++)
            {
                for(c=0;c<3;c++)
                {
                    System.out.print(b[r][c]);
                }
                System.out.println("");
             }
             System.out.println("Difference of Matrix");
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(a[r][c]- b[r][c]+" ");
                
               
            }
            System.out.println("");
            
        }
    }
}
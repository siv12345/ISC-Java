import java.util.*;
class p08
{
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            int a[][]=new int[3][3];
            int r, c;
            for(r=0;r<3;r++)
            {
                for(c=0;c<3;c++)
                {
                    System.out.println("Enter a number");
                    a[r][c]=sn.nextInt();
                }
            }            
            System.out.println("Original Matrix");
            for(r=0;r<3;r++)
            {
                for(c=0;c<3;c++)
                {
                    System.out.print(a[r][c]);
                }
                System.out.println("");
             }
             System.out.println("Transpose Matrix");
             for(c=0;c<3;c++)
            {
                for(r=0;r<3;r++)
                {
                    System.out.print(a[r][c]);
                }
                System.out.println("");
             }          
            
        }
      }


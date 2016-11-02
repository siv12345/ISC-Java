import java.util.*;
class p16
{
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            int a[][]=new int[4][4];
           
            int r, c,sum=0,sum1=0,b,b1;
            for(r=0;r<4;r++)
            {
                for(c=0;c<4;c++)
                {
                    System.out.println("Enter a number for Matrix ");
                    a[r][c]=sn.nextInt();
                    
                }
            }
            
            System.out.println("Original Matrix ");
            for(r=0;r<4;r++)
            {
                for(c=0;c<4;c++)
                {
                    System.out.print(a[r][c]);
                }
                System.out.println("");
             }
             for(b=0,b1=3;b<4;b++,b1--)
             {
                 sum=sum +a[b][b];
                 sum1=sum1 +a[b][b1];
                }
            System.out.println("Sum of primary diagnol="+sum);
            System.out.println("Sum of secondary diagnol="+sum1);
        }
    }



import java.util.*;
class p091
{
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            int r, c,k,sum=0,sum1=0;
            System.out.println("Original Matrix");
            for(r=0;r<4;r++)
            {
                for(c=0;c<4;c++)
                {
                    System.out.print(a[r][c]+"");
                }
                System.out.println("");
             }            
            
            for(r=0;r<4;r++)
            {
                for(c=0;c<4;c++)
                {    
                    sum=sum+a[r][c];
                    sum1=sum1+a[c][r];
                                     
                }
              k=0;
              System.out.println("Sum of row no."+k+"="+sum);
              System.out.println("Sum of colunm no."+k+"="+sum1);
              k++;
            
        }

    }
}
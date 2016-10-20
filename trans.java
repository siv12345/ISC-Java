//wap to accept 3x3. Display orginal and transpose
import java.util.*;
class trans
{
        public static void m()
        {
            Scanner sc = new Scanner(System.in);
            int a[][] = new int[3][3];
            //System.out.println(a.length);
            for(int i=0;i<a.length;i++)
            {
                System.out.println("Enter elements of row: "+(i+1));
                for(int j=0;j<a.length;j++)
                {   a[i][j] = sc.nextInt(); }
            }
            
            
            System.out.println("Original matrix");
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length;j++)
                { 
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            
            int b[][] = new int[3][3];
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length;j++)
                {
                    b[j][i] = a[i][j];
                }
            }
            
            System.out.println("Transpose of above matrix");
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length;j++)
                { 
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
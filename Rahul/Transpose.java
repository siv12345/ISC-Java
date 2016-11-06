/*
 * Program to accept no.s in a 3x3 matrix and print its transpose
 */
import java.io.*;
class Transpose
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] a=new int[3][3];
        System.out.println("ENTER NUMBERS:");
        for(int row=0;row<3;row++)        
            for(int col=0;col<3;col++)            
                a[row][col]=Integer.parseInt(br.readLine());    
        System.out.println("ORIGINAL MATRIX:");        
        for(int row=0;row<3;row++)  
        {
            for(int col=0;col<3;col++) 
            {
                System.out.print(a[row][col]);
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE");
        for(int col=0;col<3;col++)
        {
            for(int row=0;row<3;row++)
            {
                System.out.print(a[row][col]);
            }
            System.out.println();
        }
    }
}
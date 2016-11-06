/*
 * Program to accept the elements in a 4x4 matrix
 * and print the sum of the primary diagonal elements
 * and the secondary diagonal elements
 */
import java.io.*;
class Diagonal
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[4][4],b[][] =new int[4][4],sum1=0,sum2=0;
        System.out.println("ENTER ELEMENTS"); 
        for(int row=0;row<4;row++)        
            for(int col=0;col<4;col++)            
                a[row][col]=Integer.parseInt(br.readLine());
        System.out.println("ORIGINAL MATRIX:");        
        for(int row=0;row<4;row++)  
        {
            for(int col=0;col<4;col++) 
            {
                System.out.print(a[row][col]);
                if(row==col)
                sum1+=a[row][col];
                else if(row+col==3)
                sum2+=a[row][col];
            }
            System.out.println();
        }
        System.out.println("PRIMARY DIAGONAL:"+sum1);
        System.out.println("SECONDARY DIAGONAL:"+sum2);
    }
}
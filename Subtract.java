import java.util.*;
/**
 * Write a description of class Subtract here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subtract
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.println("Enter a number");
                a[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.println("Enter a number");
                b[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

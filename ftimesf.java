import java.util.*;

public class ftimesf
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        int a[][] = new int[4][4];
        int c[][] = new int[4][4];
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.println("Enter a number");
                a[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                if(i==j)
                sum1+=a[i][j];
            }
        }
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                c[i][j] = a[j][i];
            }
        }
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                if(i==j)
                sum2+=c[i][j];
            }
        }
        System.out.println("The sum of primary diagnol = "+sum1);
        System.out.println("The sum of seconday diagnol = "+sum2);
    }
}

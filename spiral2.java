import java.util.*;
class spiral2
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int r1,r2,c1,c2; 
        c1 = 0; r1 = 0;
        r2 = n-1; c2 = n-1;
        int no = 1;
        
        while(no<=n*n)
        {
            for(int i=c1;i<=c2;i++)
            {
              arr[r1][i]=no++;
            }
            for(int j=r1+1;j<=r2;j++)
            {
              arr[j][c2]=no++;
            }
           for(int i=c2-1;i>=c1;i--)
           {
             arr[r2][i]=no++;
           }
 
           for(int j=r2-1;j>=r1+1;j--)
           {
             arr[j][c1]=no++;
           }
           c1++;
           c2--;
           r1++;
           r2--;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println();
            for(int j=0;j<n;j++)
            {   System.out.print(arr[i][j]+"\t");   }
        }
    }
}
            
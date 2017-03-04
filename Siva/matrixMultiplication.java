import java.io.*;
class mult
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows of matrix 1");
        int m1=Integer.parseInt(br.readLine());
        System.out.println("Enter number of columns of matrix 1");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter number of rows of matrix 2");
        int m2=Integer.parseInt(br.readLine());
        int a1[][] = new int[m1][n];
        int a2[][] = new int[n][m2];
        System.out.println("ENTER MATRIX 1");
        for(int i=0;i<m1;i++)        
            for(int j = 0; j <n; j++)       
                a1[i][j]=Integer.parseInt(br.readLine());  
        System.out.println("ENTER MATRIX 2");
        for(int i=0;i<n;i++)        
            for(int j = 0; j <m2; j++)       
                a2[i][j]=Integer.parseInt(br.readLine());         
        int [][] result = new int[a1.length][a2[0].length];
        for (int i = 0; i < a1.length; i++)  
            for (int j = 0; j < a2[0].length; j++)
                for (int k = 0; k < a1[0].length; k++)  
                    result[i][j] += a1[i][k] * a2[k][j]; 
        System.out.println("Matrix 1");            
         for(int i=0;i<m1;i++)
        {
            for(int j = 0; j < n; j++)            
                System.out.print(a1[i][j]+"\t");            
            System.out.println();
        }
        System.out.println("Matrix 2"); 
         for(int i=0;i<n;i++)
        {
            for(int j = 0; j <m2; j++)            
                System.out.print(a2[i][j]+"\t");            
            System.out.println();
        }
        System.out.println("RESULT");
        for(int i=0;i<a1.length;i++)
        {
            for(int j = 0; j < a2[0].length; j++)            
                System.out.print(result[i][j]+"\t");            
            System.out.println();
        }
    }
}

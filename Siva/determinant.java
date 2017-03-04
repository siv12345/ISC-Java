import java.io.*;
class det
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[3][3],b[][]=new int[3][3],c[][]=new int[2][2],n=0,m=0,sum=0;
        System.out.println("Enter elements");
        for(int row=0;row<3;row++)      
            for(int col=0;col<3;col++)          
                a[row][col]=Integer.parseInt(br.readLine());         
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)          
                System.out.print(a[row][col]+"\t");          
            System.out.println();
        }
        for(int i=1;i<2;i++)
            for(int j=0;j<3;j++)
            {
                for(int row=0;row<3;row++)
                    for(int col=0;col<3;col++)
                        if(row!=i&&col!=j)
                        {
                            c[m][n]=a[row][col];
                            if(n==0)
                                n++;
                            else if(n==1)
                            {
                                m++;
                                n=0;
                            }
                        }      
                sum+=a[i][j]*(c[0][0]*c[1][1]-c[0][1]*c[1][0])*(int)(Math.pow(-1,i+j));
                m=0;
                n=0;
            }      
        System.out.println(sum);
    }
}

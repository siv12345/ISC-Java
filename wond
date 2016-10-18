import java.io.*;
class wm
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n=Integer.parseInt(br.readLine());
        if(n<2||n>10)
            System.exit(0);
        int sum=(n*((n*n)+1))/2,sum1=0,sum2=0,c=0,a[][]=new int[n][n];
        System.out.println("Enter element");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int m=Integer.parseInt(br.readLine());
                if(m>=1&&m<=(n*n)){
                    a[i][j]=m;
                    sum1+=m;
                }
                else
                    System.exit(1);
            }
            if(sum1!=sum)
                System.exit(1);
            sum1=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(a[i][j]==a[i][k])
                        c++;
                    sum2+=a[k][j];
                }
                if(sum2!=sum)
                    System.exit(1);
                sum2=0;
                if(c!=1)
                    System.exit(1);
                c=0;
            }
        }
        System.out.println("This is a wonderous matrix. CREDITS TO CHETHAN");
    }
}

import java.util.*;
class p27
{
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);            
            int n,r,r1,c1,cn=0 ,c,sum1=0,sum2=0,cnt1=0;
            double y=0.0;    
            System.out.println("Enter a number limit for Matrix ");
            n=sn.nextInt();
            int a[][]=new int[n][n];
            if(n>=2&&n<=10)
            { for(r=0;r<n;r++)
              {
                for(c=0;c<n;c++)
                {   System.out.println("Enter a number for Matrix from 1 to"+(n*n));
                    a[r][c]=sn.nextInt();
                    if(a[r][c]>(n*n))
                    System.out.println("Not valid");
                }
            }                    
            System.out.println("Original Matrix ");
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {   for(r1=0;r1<n;r1++)
                    {
                        if(a[r][c]==a[r][r1])
                        {cn++;}
                    }
                        System.out.print(a[r][c]+" ");
                }
                System.out.println("");
            }
            y=0.5*n*(n*n+1);
            for(int i=0;i<n;i++)
            {
               sum1=0;
               sum2=0;
               for(int j=0;j<n;j++)
               { sum1=sum1+a[i][j];
                 sum2=sum2+a[j][i];          
                 if(sum1!=y||sum2!=y)
                 {
                   cnt1++;
                 }                     
               }
            }
            if(cnt1>0&&cn>1)
            System.out.println("Wondrous square");
   }
  }
}

           
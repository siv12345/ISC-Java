import java.util.*;
class p291
{
     public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n=sn.nextInt();
        int a[]=new int[n];
        int i,y,b,j;
        for(i=0,y=1;i<n;i++,y++)
        {
            a[i]=y;
        }       
        b=1;
        while(b<n)
        {
            for(i=b;i<n;i=i+b)
            {
                for(j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                n=n-1;
            }
            b++;
        }
        System.out.println("Lucky no.s include=");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
            
    }
}

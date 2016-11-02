import java.util.*;
class P29
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int n,i,y=0,z=0,a1=2;        
        System.out.println("enter your no.");
        n=sn.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0,y=1;i<n;i++,y++)
        {
            a[i]=y;
        }
        for(i=1;i<=n;i++)
        {
           if(i%a1==0)
           {
             continue;
           }
           else 
           {
                b[z]=a[i];
                z++;
           }        
        }
        for(i=0;i<b.length;i++)
        {
        System.out.println("Lucky no.s are="+b[i]); 
        }
    }
}

                